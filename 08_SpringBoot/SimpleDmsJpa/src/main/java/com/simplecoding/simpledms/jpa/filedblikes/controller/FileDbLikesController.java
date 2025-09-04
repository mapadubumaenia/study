package com.simplecoding.simpledms.jpa.filedblikes.controller;

import com.simplecoding.simpledms.jpa.filedblikes.dto.FileDbLikesDto;
import com.simplecoding.simpledms.jpa.filedblikes.service.FileDbLikesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FileDbLikesController {

    private final FileDbLikesService fileDbLikesService;

    //  저장: (insert)좋아요 버튼 클릭
    //  TODO: 추천(ajax) :버튼 여러번 연타(화면 갱신(새로고침)증가) : 시스템 부하가 심해짐 ->ajax(부분고침)
    //    참고) ajax 발전 ->요즘: react,vue(ajax 기반(axis): 100%)
    @PostMapping("/api/filedb/likes/add")
    public void insert(@ModelAttribute FileDbLikesDto fileDbLikesDto) {
        // TODO: db저장
        fileDbLikesService.save(fileDbLikesDto);
    }




}
