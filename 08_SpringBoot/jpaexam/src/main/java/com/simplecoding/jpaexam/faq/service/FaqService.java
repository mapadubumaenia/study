package com.simplecoding.jpaexam.faq.service;


import com.simplecoding.jpaexam.common.MapStruct;
import com.simplecoding.jpaexam.faq.dto.FaqDto;
import com.simplecoding.jpaexam.faq.entity.Faq;
import com.simplecoding.jpaexam.faq.repository.FaqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FaqService {


    private final FaqRepository faqRepository;
    private final MapStruct mapStruct;


    //TODO: 상세조회
    public Faq findById(Long fno) {
        Faq faq = faqRepository.findById(fno).get();
        return faq;
    }

//  TODO: 전체조회 : 페이징
//  마이바티스+spting 페이징: 매개변수(CRiteria) 결과(PagenationInfo)
//  JPA+sptingboot 페이징: 매개변수(Pagable) 결과(Page)
//  자동 import 단축키: alt+enter
    // 엔티티-> DTO 사용 추천(보안목적, 유연성)
    //DB 결과 -> 엔티티 저장 -> DTO 복사 -> 화면으로 전달(조회)
    // dto.dno=엔티티.dno (이 코드를 자동으로 만들어주는 라이브러리:mapstruct)
    //   ->엔티티 -> DTO복사: 상세조회 (1개), 전체조회(여러개, 배열, 자동만복문(스트림))
    //  람다식: (매개변수)-> 결과 ( int sum(int a){return a+1;} : 람다식 : a->a+1
    public Page<FaqDto> findAll(Pageable pageable) {
        Page<Faq> page=faqRepository.findAll(pageable);
        return page.map(data -> mapStruct.toDto(data));
    }

// TODO: 상세조회를 DTO 사용으로 바꿔보자 (보안상 DTO를 쓰는게 좋음)
    public FaqDto findById(long fno){
        Faq faq = faqRepository.findById(fno)
                .orElseThrow(()-> new RuntimeException("정보없음"));
        return mapStruct.toDto(faq);
    }


    //저장(추가) + DTO 사용
    // 화면입력-> DTO 받기 -> 엔티티복사 -> DB저장
    public void save(FaqDto faqDto){
        Faq faq = mapStruct.toEntity(faqDto);
        faqRepository.save(faq);
    }


    // TODO: 마무리퀴즈:   1)더티체킹 이용 update-> 단위테스트
    //                      2) 삭제 가능  -> 단위테스트

    public  void deleteById(long fno){
        faqRepository.deleteById(fno);
    }


    //dirty checking 기능 이용 수정
    // 참고: @Transactional : SQL 문이 여러개 있을 경우 commit을 가장 마지막에 실행해 주는 어노테이션
    @Transactional
    public void updateFromDto(FaqDto faqDto) {
        //  1) JPA 메모리 조회 올림: 상세조회
        Faq faq = faqRepository.findById(faqDto.getFno())
                .orElseThrow(()-> new RuntimeException("정보없음"));
        //  2) setter 이용 값 수정: deptDto 값을 모두 수정
        //     mapStruct 이용(더티체킹 지원)
        //  예) dept.dname=depeDto.dname;        //엔티티에 dto 값 복사
        mapStruct.updateFromDto(faqDto, faq);
    }

    //   1) DTO사용
    public Page<FaqDto> findByTitleAndContent(String title, String content, Pageable pageable) {
        Page<Faq> page=faqRepository.findByTitleAndContent(title, content, pageable);
        return page.map(data -> mapStruct.toDto(data));
    }

    // 2) like 검색 DTO 사용
    public Page<FaqDto> selectAll(String searchkeyword , Pageable pageable) {
        Page<Faq> page=faqRepository.selectAll(searchkeyword,pageable);
        return page.map(data -> mapStruct.toDto(data));
    }


    // 3) DTO 새로 만들어서 평균값, 최대값 내기  faq 사이트엔 딱히 평균값 낼게 없다.




}
