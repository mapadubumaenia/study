package com.simplecoding.simpledms.auth.service;

import com.simplecoding.simpledms.auth.dto.MemberDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Log4j2                 // 결과 확인용 어노테이션
@SpringBootTest         // 스프링부트용 Junit 테스트 어노테이션
@EnableJpaAuditing
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    void save() {

        //(given)
        MemberDto memberDto=new MemberDto();
        memberDto.setEmail("forbob3@naver.com");
        memberDto.setPassword("123456");
        memberDto.setName("홍길동");
        memberDto.setCodeName("ROLE_ADMIN");
        //(when)
        memberService.save(memberDto);
        //(then)  =>DB에서 확인


    }
}