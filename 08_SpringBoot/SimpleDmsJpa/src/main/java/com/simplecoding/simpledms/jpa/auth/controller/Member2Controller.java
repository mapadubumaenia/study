package com.simplecoding.simpledms.jpa.auth.controller;


import com.simplecoding.simpledms.jpa.auth.dto.Member2Dto;
import com.simplecoding.simpledms.jpa.auth.service.Member2Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
public class Member2Controller {


    private final Member2Service member2Service;

    public Member2Controller(Member2Service member2Service) {
        this.member2Service = member2Service;
    }

    //이쁜 로그인 페이지 열기
    @GetMapping("/auth/login")
    public String login(){
        return "auth/login";
    }


// 회원가입 페이지
    @GetMapping("/auth/register")
    public String registerView(){
        return "auth/register";
    }


    //회원 저장: 저장버튼 클릭시 실행
    //TODO: 회원가입하고 나서 그 페이지에 성공메세지 전달(추가)
    @PostMapping("/auth/register/addition")
    public String register(@ModelAttribute Member2Dto member2Dto, Model model) {
        //  1) DB저장
        member2Service.save(member2Dto);
        //  2) register.jsp 로 성공메세지 전달
        model.addAttribute("msg", "회원가입을 성공했습니다.");
        return "auth/register";
    }

    //TODO: 관리자 회원가입 페이지 열기(로그인 해야 보임)
    @GetMapping("/admin/register")
    public String registerAdminView() {
        return "auth/register_admin";
    }


    //TODO: 관리자 저장 기능: 저장 버튼 클릭시 실행
    @PostMapping("/admin/register/addition")
    public String registerAdmin(@ModelAttribute Member2Dto member2Dto, Model model) {
        member2Service.save(member2Dto);
        model.addAttribute("msg","관리자 회원이 생성되었습니다.");
        return "auth/register_admin";

    }




}
