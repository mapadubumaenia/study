package com.simplecoding.simpledms.auth.service;


import com.simplecoding.simpledms.auth.dto.SecurityUserDto;
import com.simplecoding.simpledms.auth.entity.Member;
import com.simplecoding.simpledms.auth.repository.MemberRepository;
import com.simplecoding.simpledms.common.ErrorMsg;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

//TODO: 시큐리티용 서비스 작성
// 목적: 우리DB에 사용자가 있는지 확인
//   =>(yes) :인증(로그인)통과: 시큐리티 DTO 정보를 넣으면 통과(리턴)
//   =>(NO)  :에러처리
@Service
@RequiredArgsConstructor                              //=>final 이 붙은 필드를 생성자를 만들어준다
public class UserDetailsServiceImpl implements UserDetailsService {
// 생성자 DI :레포지토리 , 에러처리용 클래스
    private final MemberRepository memberRepository;
    private final ErrorMsg errorMsg;

    //오버라이딩 메소드: 실행시점(아이디/암호 검증 필터 클래스가 실행함)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //TODO: 1)상세조회: 우리 DB에 사용자가 있는지 확인
        //  username: 의미=>아이디(email)
        Member member=memberRepository.findById(username)
                .orElseThrow(()->new RuntimeException(errorMsg.getMessage("errors.not.found")));

        //TODO: (보충) 우리DB에 유저가 있으면 아래 절차 진행
        //TODO:  2)권한 배열을 만들어서 시큐리티유저DTO에 정보를 전달
        GrantedAuthority authority=new SimpleGrantedAuthority(member.getCodeName());   //시큐리티 권한 생성(ROLE_ADMIN)
        Set<GrantedAuthority> authorities=new HashSet<>();                             //Set (집합 배열) 생성
        authorities.add(authority);                                                    //배열에 권한 넣기


        //SecurityUserDto 생성자로 리턴
        return new SecurityUserDto(member.getEmail(), member.getPassword(), authorities);
    }
}
