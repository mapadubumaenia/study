package com.simplecoding.simpledms.qna.controller;


import com.simplecoding.simpledms.qna.dto.QnaDto;
import com.simplecoding.simpledms.qna.service.QnaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Log4j2
@Controller
public class QnaController {
    //    생성자 DI: 서비스
    private final QnaService qnaService;

    //    전체조회: (페이징: 매개변수(Pageable), 결과(Page))
    @GetMapping("/qna")
    public String selectQnaList(@RequestParam(defaultValue = "") String searchKeyword,
                                 @PageableDefault(page = 0, size = 3) Pageable pageable,
                                 Model model) {
//        1) 전체 조회
        Page<QnaDto> pages=qnaService.selectQnaList(searchKeyword, pageable);
//        로깅
        log.info(pages.getContent()); // 배열 결과 확인
//        2) jsp 로 전달: Model 사용
        model.addAttribute("qna", pages.getContent()); // 부서 배열
        model.addAttribute("pages", pages);              // 페이지 정보(현재페이지번호, 총건수 등)

        return "qna/qna_all";
    }

}
