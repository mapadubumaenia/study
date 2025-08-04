package com.simplecoding.simpledms.faq.controller;

import com.simplecoding.simpledms.faq.dto.FaqDto;
import com.simplecoding.simpledms.faq.service.FaqService;
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

// TODO: 용도: final 이 붙은 필드를 매개변수로 하는 생성자를 만들어줍니다.
//   예) FaqController(FaqService faqService){}
@Log4j2
@RequiredArgsConstructor
@Controller
public class FaqController {
    //    서비스를 생성자 DI
    private final FaqService faqService;

    //    전체조회: 페이징
    @GetMapping("/faq")
    public String selectDeptList(@RequestParam(defaultValue = "") String searchKeyword,
                                 @PageableDefault(page = 0, size = 3) Pageable pageable,
                                 Model model) {
//        1) 전체 조회
        Page<FaqDto> pages = faqService.selectFaqList(searchKeyword, pageable);
//        로깅
        log.info(pages.getContent()); // 배열 결과 확인
//        2) jsp 로 전달: Model 사용
//        controller -> jsp 값을 전달할때 : model.addAttribute("키",값)
//                              jsp      : {키}
        model.addAttribute("faqs", pages.getContent()); // Faq 배열
        model.addAttribute("pages", pages);              // 페이지 정보(현재페이지번호, 총건수 등)

        return "faq/faq_all";
    }

    //    마무리퀴즈: 전체조회 디자인/jsp,
    //              추가페이지 열기, 저장 기능 구현(서비스,컨트롤러,jsp)
    //    추가 페이지 열기
    @GetMapping("/faq/addition")
    public String createFaqView() {
        return "faq/add_faq";
    }

    //    저장 버튼클릭시 insert
    @PostMapping("/faq/add")
    public String insert(@ModelAttribute FaqDto faqDto) {
//        서비스 insert
        faqService.save(faqDto);
        return "redirect:/faq";
    }

    //    수정 페이지 열기
    @GetMapping("/faq/edition")
    public String updateFaqView(@RequestParam long fno,
                                Model model) {
//        서비스의 상세조회 실행
        FaqDto faqDto=faqService.findById(fno);
        model.addAttribute("faq",faqDto);
        return "faq/update_faq";
    }

    //    수정 버튼 클릭시 udpate
    @PostMapping("/faq/edit")
    public String update(@ModelAttribute FaqDto faqDto) {
//        서비스의 수정함수 실행
        faqService.updateFromDto(faqDto);
        return "redirect:/faq";
    }

    //   삭제
    @PostMapping("/faq/delete")
    public String  deleteById(@RequestParam long fno) {
//        서비스의 삭제 실행
        faqService.deleteById(fno);
        return "redirect:/faq";
    }

}












