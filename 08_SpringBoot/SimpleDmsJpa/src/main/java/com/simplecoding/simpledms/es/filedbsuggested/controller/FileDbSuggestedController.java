package com.simplecoding.simpledms.es.filedbsuggested.controller;

import com.simplecoding.simpledms.es.filedbsuggested.dto.FileDbSuggestedDto;
import com.simplecoding.simpledms.es.filedbsuggested.service.FileDbSuggestedService;
import com.simplecoding.simpledms.es.gallerysuggested.dto.GallerySuggestedDto;
import com.simplecoding.simpledms.es.gallerysuggested.service.GallerySuggestedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FileDbSuggestedController {

    private final FileDbSuggestedService fileDbSuggestedService;
    private final GallerySuggestedService gallerySuggestedService;

    //마이페이지에 추천목록 상세조회
    @GetMapping("/mypage")
    public String findById(Model model){
        // TODO: 1)서비스의 상세조회 실행
        FileDbSuggestedDto fileDbSuggestedDto = fileDbSuggestedService.findById();
        GallerySuggestedDto gallerySuggestedDto = gallerySuggestedService.findById();
        // TODO: 2)결과 모델에 넣기
        model.addAttribute("fileDbSuggested",fileDbSuggestedDto);
        model.addAttribute("gallerySuggested",gallerySuggestedDto);
        return "mypage";

    }




}
