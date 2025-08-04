package com.simplecoding.simpledms.faq.service;

import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.faq.dto.FaqDto;
import com.simplecoding.simpledms.faq.entity.Faq;
import com.simplecoding.simpledms.faq.repository.FaqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FaqService {
    //    생성자 DI
    private final FaqRepository faqRepository;
    private final MapStruct mapStruct;       // 복사 라이브러리
    private ErrorMsg errorMsg;

    //    전체조회: 페이징 + DTO 리턴
//    TODO: 조회: DB 결과 -> 엔티티클래스 저장 -> DTO 복사 -> DTO 를 화면 표시(추천)
//      예) dto.fno=엔티티.fno 코딩하는것: 값 복사 => 길어져서 : 복사 라이브러리 사용(MapStruct)
    public Page<FaqDto> selectFaqList(String searchKeyword,
                                   Pageable pageable) {
        Page<Faq> page = faqRepository.selectFaqList(searchKeyword,pageable);
//        자바의 stream(자동 반복: 배열의 끝까지 코드를 자동 반복)
//        람다식: long sum(int a){return a+1;} : a->a+1
        return page.map(data->mapStruct.toDto(data));
    }

    //    추가: 화면입력->DTO 저장->엔티티 복사-> DB저장
    public void save(FaqDto faqDto) {
        Faq faq=mapStruct.toEntity(faqDto);
        faqRepository.save(faq);
    }


    //    TODO: 상세조회: JPA 기본메소드(sql 작성 없음)
    public FaqDto findById(long fno) {
//        Optional 레퍼클래스: Null 을 다루는 편리한 메소드를 가지고 있는 클래스
//        의미: findById(상세조회) 했는데 결과가 null 이면 정보없음 이라고 화면에표시
//             아니면 dept 변수에 결과가 저장됨
        Faq faq=faqRepository.findById(fno)
                .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
        return mapStruct.toDto(faq);
    }


    //    TODO 수정: 1) save() 재사용: dto 에 기본키값이(dno) 있으면 수정(update)됩니다.
//                               없으면 insert 됩니다.
//              2) dirty checking(추천): save() 함수 이용안함, setter 로 값을 수정하면
//                                 JPA 가 전에 값과 비교해서 다르면 update합니다.
//                                 같으면 안합니다.
//                                  (단, 메소드 위에 @Transactional 붙일것)
    @Transactional
    public void updateFromDto(FaqDto faqDto) {
//        더티 체킹 수정 코딩법: 1) 상세조회(DB값)
        Faq faq=faqRepository.findById(faqDto.getFno())
                .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
//                            2) setter 이용해서 값 수정(dto -> 엔티티로 수정): 복사라이브러리(MapStruct)
        mapStruct.updateFromDto(faqDto, faq);
    }

    //    삭제
    public void deleteById(long fno) {
        faqRepository.deleteById(fno);
    }


}



