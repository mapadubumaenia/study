package com.simplecoding.simpledms.auth.service;

import com.simplecoding.simpledms.jpa.auth.dto.Member2Dto;
import com.simplecoding.simpledms.jpa.auth.service.Member2Service;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@Log4j2                 // 결과 확인용 어노테이션
@SpringBootTest         // 스프링부트용 Junit 테스트 어노테이션
class Member2ServiceTest {

    @Autowired
    Member2Service member2Service;

    @Test
    void save() {

        //(given)
            Member2Dto member2Dto = new Member2Dto();
            member2Dto.setEmail("forbob6@naver.com");
            member2Dto.setPassword("123456");
            member2Dto.setFullname("장길산");
            member2Dto.setCodeName("ROLE_ADMIN");
        //(when)
        member2Service.save(member2Dto);
        //(then) DB에서 확인



    }
}