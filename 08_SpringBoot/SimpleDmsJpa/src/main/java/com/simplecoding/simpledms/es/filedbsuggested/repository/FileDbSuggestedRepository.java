package com.simplecoding.simpledms.es.filedbsuggested.repository;



import com.simplecoding.simpledms.es.filedbsuggested.entity.FileDbSuggested;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


// TODO: 사용법: public interface 레포지토리명 extends ElasticsearchRepository<엔티티클래스, 기본키자료형>
//   => Querydsl 작성없이 기본메소드 사용 가능: 1)전체조회, 2)상세조회 3)추가 4)수정 5)삭제  => 보통 조회용으로 엘라스틱을 쓰기떄문에 추가 수정 삭제는 안씀
@Repository
public interface FileDbSuggestedRepository extends ElasticsearchRepository<FileDbSuggested, String> {





}
