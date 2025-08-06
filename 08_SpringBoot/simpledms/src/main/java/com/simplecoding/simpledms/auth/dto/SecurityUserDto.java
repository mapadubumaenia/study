package com.simplecoding.simpledms.auth.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

//TODO: 스프링 시큐리티 인증(로그인)에 필요한 DTO
//  작성법: 1)스프링 시큐리티 클래스 상속:User
//         2)시큐리티 클래스의 생성자 작성 마우스우클릭 =>생성=>생성자작성으로 만듬
//         3)@Getter  @Setter 만들기
// collection<? extends GrantedAuthority> 권한변수: 권한은 배열로 관리(예) 관리자,운영자 권한들)
@Setter
@Getter
public class SecurityUserDto extends User {


    public SecurityUserDto(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}
