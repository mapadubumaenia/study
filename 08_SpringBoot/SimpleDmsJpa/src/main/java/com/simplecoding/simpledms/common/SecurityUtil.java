package com.simplecoding.simpledms.common;

import com.simplecoding.simpledms.jpa.auth.dto.SecurityUser2Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

// TODO: 시큐리티 클래스에서 이메일 꺼내기 공통 클래스
@Component
@RequiredArgsConstructor
public class SecurityUtil {
    private final ErrorMsg errorMsg;

// 시큐리티 클래스에서 유저 꺼내기 함수
    public SecurityUser2Dto getLoginUser() {
// TODO: 1)시큐리티 필통(holder)에서 유저 꺼내기
//   용어: principal=유저
//   TODO: 2) 소셜로그인 -> 시큐리티 필통: 시큐리티유저 또는 소셜로그인 유저
    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//      SecurityUser2Dto 유저인지 확인 -> 아니면 에러처리
//       TODO: 사용법: 변수 instanceof 클래스 변수2 : 변수가 클래스이면 true, 아니면 false
    if(principal instanceof SecurityUser2Dto user){
        return user;
    }
    throw new RuntimeException(errorMsg.getMessage("errors.unauthorized"));    //에러 강제 발생
    }
}
