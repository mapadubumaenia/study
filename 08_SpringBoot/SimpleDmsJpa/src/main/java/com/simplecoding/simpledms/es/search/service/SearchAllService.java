package com.simplecoding.simpledms.es.search.service;

import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.es.search.dto.SearchAllDto;
import com.simplecoding.simpledms.es.search.entity.SearchAll;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.client.elc.NativeQueryBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchAllService {
    private final ElasticsearchOperations elasticsearchOperations;   //TODO: querysal 작성용 클래스
    private final MapStruct mapStruct;


    //  1) 통합 (multi-match)검색하기
    public Page<SearchAllDto> search(String keyword, Pageable pageable) {
        // TODO: 1) Querydsl 작성
        Query query=new NativeQueryBuilder()
                .withQuery(
                        q->q.multiMatch(                                                          //통합검색 키워드
                                m->m.fields("dname","loc","ename","job")            //대상필드 넣기
                                        .query(keyword)                                                  // 검색어
                        )
                )
                .withPageable(pageable)                                                                  // 페이징 넣기
                .build();                                                                                //조립완성
        // TODO:  2)엔티티->dto 변환

        SearchHits<SearchAll> hits=elasticsearchOperations.search(query, SearchAll.class);               // hits 결과 배열 가져오기
        List<SearchAllDto> content=hits.getSearchHits().stream()
                .map(h->mapStruct.toDto(h.getContent()))
                .collect(Collectors.toList());


        // TODO: 3)PageImpl 클래스 넣기: 페이징 처리가 됨
        //    content: 결과 배열
        //    pageable: 페이징 정보
        //   hits.getTotalHits() 총건수
        //  사용법: new PageImpl<>(결과,페이징,총건수);
    return new PageImpl<>(content,pageable,hits.getTotalHits());

    }

    //  2)예제  match 검색하기
    public Page<SearchAllDto> match(String keyword,Pageable pageable) {
        //  TODO: 1)Query 작성
            Query query=new NativeQueryBuilder()
                    .withQuery(q->q.match(m->m.field("dname").query(keyword)))
                    .withPageable(pageable)
                    .build();

        // TODO: 2)엔티티(문서) ->DTO 변환

        SearchHits<SearchAll> hits=elasticsearchOperations.search(query, SearchAll.class);   //결과배열(hits) 가져오기
        List<SearchAllDto> content=hits.getSearchHits().stream()
                .map(h->mapStruct.toDto(h.getContent()))
                .collect(Collectors.toList());



        // TODO: 3)PageImpl 넣기
        return new PageImpl<>(content,pageable,hits.getTotalHits());


    }

    //  3)예제 term 검색하기(키워드 검색): 정렬 집계 가능
    public Page<SearchAllDto> term(String keyword, Pageable pageable) {
        // TODO 1)Query 작성
        Query query=new NativeQueryBuilder()
                .withQuery(q->q.term(m->m.field("job.keyword").value(keyword)))
                .withPageable(pageable)
                .build();


        // TODO 2)엔티티(문서)-> DTO 변환
        SearchHits<SearchAll> hits=elasticsearchOperations.search(query, SearchAll.class);   //결과배열(hits) 가져오기
        List<SearchAllDto> content=hits.getSearchHits().stream()
                .map(h->mapStruct.toDto(h.getContent()))
                .collect(Collectors.toList());


        // TODO 3) PageImpl 넣기
        return new PageImpl<>(content,pageable,hits.getTotalHits());
    }

}
