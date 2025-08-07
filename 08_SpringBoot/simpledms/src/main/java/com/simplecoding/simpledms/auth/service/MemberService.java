package com.simplecoding.simpledms.auth.service;


import com.simplecoding.simpledms.auth.dto.MemberDto;
import com.simplecoding.simpledms.auth.entity.Member;
import com.simplecoding.simpledms.auth.repository.MemberRepository;
import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor            //=>생성자를 만들어주는 어노테이션
public class MemberService {

//생성자DI
    private final MemberRepository memberRepository;
    private final MapStruct mapStruct;                      //복사 라이브러리
    private final ErrorMsg errorMsg;                        //에러표시 클래스
    private final PasswordEncoder passwordEncoder;          // 암호화 클래스


    // 회원가입
    public void save(MemberDto memberDto) {
       //TODO:  1)이메일(아이디)이 있는 지 확인
        //  사용법: memberRepository.existsById(기본키값()) : 값이 있으면 true, 없으면 false
        //  (자동 sql 만들어서 실행)

        if (memberRepository.existsById(memberDto.getEmail())) {
            throw new RuntimeException(errorMsg.getMessage("errors.register"));
        }
        //TODO: 2)회원 가입 안된사람: 평문 암호-> 해싱 암호화
        // 사용법: passwordEncoder.encode(평문암호());  => 해싱암호 리턴
        String encodedPassword = passwordEncoder.encode(memberDto.getPassword());

        //TODO: 3)setter 저장
        memberDto.setPassword(encodedPassword);

        //TODO: 4)복사라이브러리: dto->엔티티로 변경
        Member member= mapStruct.toEntity(memberDto);

        //    TODO: 5) DB 저장
        memberRepository.save(member);
    }



}
