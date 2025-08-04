package com.simplecoding.simpledms.dept.controller;

import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.dept.service.DeptService;
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
@Log4j2
@Controller
public class DeptController {
//    생성자 DI: 서비스
    private final DeptService deptService;

//    전체조회: (페이징: 매개변수(Pageable), 결과(Page))
//     TODO: 현재페이지번호(page), 화면에보일개수(size)
//      @PageableDefault(page = 0, size = 3) : jsp에서 값을 보내지 않을 경우 기본값으로 0,3을 사용하겠다는 의미
//    쿼리스트링: @RequestParam()
    @GetMapping("/dept")
    public String selectDeptList(@RequestParam(defaultValue = "") String searchKeyword,
                                 @PageableDefault(page = 0, size = 3) Pageable pageable,
                                 Model model) {
//        1) 전체 조회
        Page<DeptDto> pages=deptService.selectDeptList(searchKeyword, pageable);
//        로깅
        log.info(pages.getContent()); // 배열 결과 확인
//        2) jsp 로 전달: Model 사용
        model.addAttribute("depts", pages.getContent()); // 부서 배열
        model.addAttribute("pages", pages);              // 페이지 정보(현재페이지번호, 총건수 등)

        return "dept/dept_all";
    }

//    추가 페이지 열기
    @GetMapping("/dept/addition")
    public String createDeptView() {
        return "dept/add_dept";
    }

//    저장 버튼클릭시 insert
    @PostMapping("/dept/add")
    public String insert(@ModelAttribute DeptDto deptDto) {
//        서비스 insert
        deptService.save(deptDto);
        return "redirect:/dept";
    }

//    수정 페이지 열기
    @GetMapping("/dept/edition")
    public String updateDeptView(@RequestParam long dno,
                                 Model model) {
//        서비스의 상세조회 실행
        DeptDto deptDto=deptService.findById(dno);
        model.addAttribute("dept",deptDto);
        return "dept/update_dept";
    }

//    수정 버튼 클릭시 udpate
    @PostMapping("/dept/edit")
    public String update(@ModelAttribute DeptDto deptDto) {
//        서비스의 수정함수 실행
        deptService.updateFromDto(deptDto);
        return "redirect:/dept";
    }

    @PostMapping("/dept/delete")
    public String  deleteById(@RequestParam long dno) {
//        서비스의 삭제 실행
        deptService.deleteById(dno);
        return "redirect:/dept";
    }

}
