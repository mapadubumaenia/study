package com.simplecoding.simpledms.emp.controller;


import com.simplecoding.simpledms.dept.dto.DeptDto;
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

@RequiredArgsConstructor
@Controller
@Log4j2
public class EmpController {
    //생성자 DI: 서비스
    private final EmpService empService;
    //TODO: 현재페이지 번호(page), 화면에 보일 개수(size)
    //  @PageableDegault(page=0,size=3): jsp에서 값을 보내지 않을경우 기본값 설정하는 어노테이션
    // 쿼리스트링: @RequestParam()

    @GetMapping("/emp")
    public String selectEmpList(@RequestParam(defaultValue = "")String searchKeyword,
                               @PageableDefault (page = 0,size = 7) Pageable pageable,
                                Model model){
        //  1)전체조회
        Page<EmpDto> pages=empService.selectEmpList(searchKeyword,pageable);
        // 로깅
        log.info(pages.getContent());
        //  2)jsp로 전달: model 사용
        model.addAttribute("emps",pages.getContent());   //부서 배열
        model.addAttribute("pages",pages);

        return "emp/emp_all";

    }

    //  추가 페이지 열기
    @GetMapping("/emp/addition")
    public String createEmpView(){
        return "emp/add_emp";
    }


    // 저장 버튼 클릭시 insert
    @PostMapping("/emp/add")
    public String insert(@ModelAttribute EmpDto empDto){
        // 서비스 insert
        empService.save(empDto);
        return "redirect:/emp";


    }


    //수정페이지 열기
    @GetMapping("/emp/edition")
    public String updateEmpView(@RequestParam long eno, Model model
    ){
        // 서비스의 상세조회 실행
        EmpDto empDto=empService.findById(eno);
        model.addAttribute("emp",empDto);
        return "emp/update_emp";
    }



}
