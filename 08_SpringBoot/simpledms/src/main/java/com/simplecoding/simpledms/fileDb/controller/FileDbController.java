package com.simplecoding.simpledms.fileDb.controller;


import com.simplecoding.simpledms.fileDb.dto.FileDbDto;
import com.simplecoding.simpledms.fileDb.service.FileDbService;
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
public class FileDbController {

    //    생성자 DI: 서비스
    private final FileDbService fileDbService;

    //    전체조회: (페이징: 매개변수(Pageable), 결과(Page))
//     TODO: 현재페이지번호(page), 화면에보일개수(size)
//      @PageableDefault(page = 0, size = 3) : jsp에서 값을 보내지 않을 경우 기본값으로 0,3을 사용하겠다는 의미
//    쿼리스트링: @RequestParam()
    @GetMapping("/fileDb")
    public String selectFileDbList(@RequestParam(defaultValue = "") String searchKeyword,
                                 @PageableDefault(page = 0, size = 3) Pageable pageable,
                                 Model model) {
//        1) 전체 조회
        Page<FileDbDto> pages=fileDbService.selectFileDbList(searchKeyword, pageable);
//        로깅
        log.info(pages.getContent()); // 배열 결과 확인
//        2) jsp 로 전달: Model 사용
        model.addAttribute("fileDbs", pages.getContent()); // 부서 배열
        model.addAttribute("pages", pages);              // 페이지 정보(현재페이지번호, 총건수 등)

        return "fileDb/fileDb_all";
    }



}
