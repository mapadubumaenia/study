package com.simplecoding.jpaexam.faq.service;

import com.simplecoding.jpaexam.faq.entity.Faq;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
         Faq faq = faqService.findById(fno);
        //TODO:  3)검증: log.info(), assert 함수 등
        log.info(faq);



    }
}