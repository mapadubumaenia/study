package com.simplecoding.simpledms.es.gallerysuggested.service;

import com.simplecoding.simpledms.es.gallerysuggested.dto.GallerySuggestedDto;
import com.simplecoding.simpledms.jpa.auth.dto.SecurityUser2Dto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class GallerySuggestedServiceTest {

    @Autowired
    GallerySuggestedService gallerySuggestedService;

    // TODO :로그인이 없으면 바로 테스트
    // TODO: 로그인이 안되어있으면 바로 인증에러가 발생함

    @BeforeEach
    void setUp() {
        // TODO: 테스트 전에 할것을 실행 :강제로 로그인 상태 만들기
        // TODO: 1)유저 정보 준비: 계정, 암호, 권한들
        String email="forbob@naver.com";    //계정
        String password="123456";           //암호
        // 권한배열
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN");
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(authority);      //권한배열

        //  TODO: 시큐리티 유저에 위의 정보 넣기
        SecurityUser2Dto securityUserDto = new SecurityUser2Dto(email, password, authorities);

        //  TODO: 3)로그인된(인증) 유저로 만들기
        //        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(시큐리티유저,암호());
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(securityUserDto,securityUserDto.getPassword());

        //  TODO: 4)로그인된 유저는 필통에(holder) 넣기
        SecurityContextHolder.getContext().setAuthentication(auth);



    }


    @Test
    void findById() {

        GallerySuggestedDto gallerySuggestedDto=gallerySuggestedService.findById();

        log.info(gallerySuggestedDto);


    }
}