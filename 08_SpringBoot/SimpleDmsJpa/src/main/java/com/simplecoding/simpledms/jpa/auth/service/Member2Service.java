package com.simplecoding.simpledms.jpa.auth.service;


import com.simplecoding.simpledms.jpa.auth.dto.Member2Dto;
import com.simplecoding.simpledms.jpa.auth.entity.Member2;
import com.simplecoding.simpledms.jpa.auth.repository.Member2Repository;
import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Member2Service {

// 생성자 DI
    private final Member2Repository member2Repository;
    private final MapStruct mapStruct;
    private final ErrorMsg errorMsg;
    private final PasswordEncoder passwordEncoder;

    //회원가입
    public void save(Member2Dto member2Dto) {
        //TODO:  1)이메일(아이디)이 있는 지 확인
        //  사용법: memberRepository.existsById(기본키값()) : 값이 있으면 true, 없으면 false
        //  (자동 sql 만들어서 실행)
        if (member2Repository.existsById(member2Dto.getEmail())){
            throw new RuntimeException(errorMsg.getMessage("errors.regidter"));
        }
        //TODO: 2)회원 가입 안된사람: 평문 암호-> 해싱 암호화
        // 사용법: passwordEncoder.encode(평문암호());  => 해싱암호 리턴
        String encodedPassword = passwordEncoder.encode(member2Dto.getPassword());
        //TODO: 3)setter 저장
        member2Dto.setPassword(encodedPassword);

        //TODO: 4)복사라이브러리: dto->엔티티로 변경
        Member2 member2= mapStruct.toEntity(member2Dto);

        //    TODO: 5) DB 저장
        member2Repository.save(member2);



    }

















}
