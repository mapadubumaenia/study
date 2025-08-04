package com.simplecoding.simpledms.emp.controller;

import com.simplecoding.simpledms.emp.dto.EmpDto;
import com.simplecoding.simpledms.emp.service.EmpService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 퀴즈 : 전체조회(페이징) : 부서보고 하기
@RequiredArgsConstructor
@Log4j2
@Controller
public class EmpController {
    //    생성자 DI: 서비스
    private final EmpService empService;

    //    전체조회(페이징)
    @GetMapping("/emp")
    public String selectEmpList(@RequestParam(defaultValue = "") String searchKeyword,
                                @PageableDefault(page = 0, size = 3) Pageable pageable,
                                Model model) {
//        1) 전체 조회
        Page<EmpDto> pages = empService.selectEmpList(searchKeyword, pageable);
//        로깅
        log.info(pages.getContent()); // 배열 결과 확인
//        2) jsp 로 전달: Model 사용
        model.addAttribute("emps", pages.getContent()); // 부서 배열
        model.addAttribute("pages", pages);              // 페이지 정보(현재페이지번호, 총건수 등)

        return "emp/emp_all";
    }

    //    추가페이지 열기
    @GetMapping("/emp/addition")
    public String createEmpView() {
        return "emp/add_emp";
    }

    //    TODO: 퀴즈 : 저장버튼클릭시 insert
    @PostMapping("/emp/add")
    public String insert(@ModelAttribute EmpDto empDto) {
//        서비스 insert
        empService.save(empDto);
        return "redirect:/emp";
    }

    //    TODO: 퀴즈: 수정페이지 열기(상세조회 됨)
//    수정 페이지 열기
    @GetMapping("/emp/edition")
    public String updateEmpView(@RequestParam long eno,
                                 Model model) {
//        서비스의 상세조회 실행
        EmpDto empDto = empService.findById(eno);
        model.addAttribute("emp", empDto);
        return "emp/update_emp";
    }

//    수정
    //    수정 버튼 클릭시 udpate
    @PostMapping("/emp/edit")
    public String update(@ModelAttribute EmpDto empDto) {
    //        서비스의 수정함수 실행
        empService.updateFromDto(empDto);
        return "redirect:/emp";
    }

    @PostMapping("/emp/delete")
    public String  deleteById(@RequestParam long eno) {
//        서비스의 삭제 실행
        empService.deleteById(eno);
        return "redirect:/emp";
    }
}
