package com.simplecoding.simpledms.auth.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class MemberController {


    //이쁜 로그인 페이지 열기
    @GetMapping("/auth/login")
    public String login(){
        return "auth/login";
    }

}
