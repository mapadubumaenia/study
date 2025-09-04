package com.simplecoding.simpledms.jpa.auth.service;


import com.simplecoding.simpledms.jpa.auth.dto.SecurityUser2Dto;
import com.simplecoding.simpledms.jpa.auth.entity.Member2;
import com.simplecoding.simpledms.jpa.auth.repository.Member2Repository;
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

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final Member2Repository member2Repository;
    private final ErrorMsg errorMsg;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //TODO: 1)상세조회: 우리 DB에 사용자가 있는지 확인
        //  username: 의미=>아이디(email)
        Member2 member2=member2Repository.findById(username)
                .orElseThrow(()->new RuntimeException(errorMsg.getMessage("errors.not.found")));


//TODO: (보충) 우리DB에 유저가 있으면 아래 절차 진행
        //TODO:  2)권한 배열을 만들어서 시큐리티유저DTO에 정보를 전달
        GrantedAuthority authority= new SimpleGrantedAuthority(member2.getCodeName());
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(authority);


        //생성자로 리턴
        return new SecurityUser2Dto(member2.getEmail(),member2.getPassword(),authorities);
    }
}
