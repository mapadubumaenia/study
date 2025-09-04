package com.simplecoding.simpledms.jpa.gallerylikes.controller;



import com.simplecoding.simpledms.jpa.gallerylikes.dto.GalleryLikesDto;
import com.simplecoding.simpledms.jpa.gallerylikes.service.GalleryLikesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GalleryLikesController {
    private final GalleryLikesService galleryLikesService;



    //  저장: (insert)좋아요 버튼 클릭
    //  TODO: 추천(ajax) :버튼 여러번 연타(화면 갱신(새로고침)증가) : 시스템 부하가 심해짐 ->ajax(부분고침)
    //    참고) ajax 발전 ->요즘: react,vue(ajax 기반(axis): 100%)
    @PostMapping("/api/gallery/likes/add")
    public void insert(@ModelAttribute GalleryLikesDto galleryLikesDto) {
        galleryLikesService.save(galleryLikesDto);
    }


}
