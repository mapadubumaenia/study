package com.simplecoding.jpaexam.faq.service;

import com.simplecoding.jpaexam.faq.dto.FaqDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Log4j2                    //TODO: 로깅, 디버깅 용
@SpringBootTest            //TODO: 스프링부트에서 JUNIT 테스트할 때 붙임
@EnableJpaAuditing
class FaqServiceTest {

    @Autowired
    private FaqService faqService;



    @Test
    void findById() {

        //TODO:  1)테스트 조건
         long fno = 1;
        //TODO:  2)실제실행
         FaqDto faqDto = faqService.findById(fno);
        //TODO:  3)검증: log.info(), assert 함수 등
        log.info(faqDto);
    }


    // 전체조회 DTO+페이지네이션
    @Test
    void findAll() {
        Pageable pageable = PageRequest.of(0, 3);
        Page<FaqDto> page = faqService.findAll(pageable);
        log.info(page);
        // JPA 페이징 결과 클래스: Page()배열을 눈으로 보고 싶다면 아래 page getContent 입력
        log.info(page.getContent());
    }


    // insert 할때는 기본키를 제외하고
    @Test
    void insert() {
        FaqDto faqDto = new FaqDto();
        faqDto.setTitle("제목");
        faqDto.setContent("내용");
        //실행
        faqService.save(faqDto);
    }

    //수정
    // update할때 기본키를 넣고 함
    @Test
    void update() {
        FaqDto faqDto = new FaqDto();
        faqDto.setFno((long)21);
        faqDto.setTitle("업데이트");
        faqDto.setContent("컴플릿");
        //실행
        faqService.save(faqDto);
    }

    @Test
    void deleteById() {
        faqService.deleteById((long)21);
    }

    // 더티체킹 수정
    @Test
    void updateFromDto() {
        FaqDto faqDto=new FaqDto();
        faqDto.setFno((long)1);
        faqDto.setTitle("아이코이");
        faqDto.setContent("아이아이");
        //실행: 더티체킹 함수
        faqService.updateFromDto(faqDto);
    }

    // TODO: SQL직접 작성 함수들

    //   1) DTO사용

    @Test
    void findByTitleAndContent(){
        String title="제목4";
        String content="해결방법2";
        Pageable pageable= PageRequest.of(0, 3); // 테스트 용

        //        2) 테스트 실행
        Page<FaqDto> page=faqService.findByTitleAndContent(title, content, pageable);
        //결과확인
        log.info(page);
        log.info(page.getContent());
    }

    // 2) like 검색 DTO 사용
    @Test
    void selectAll() {
        // 1) 테스트 준비
        String searchkeyword ="2";
        Pageable pageable= PageRequest.of(0, 3);

        //        2) 테스트 실행

        Page<FaqDto> page=faqService.selectAll(searchkeyword,pageable);
        //결과확인
        log.info(page);
        log.info(page.getContent());
    }

    // 3) DTO 새로 만들어서 평균값, 최대값 내기




}