package com.simplecoding.simpledms.jpa.gallerylikes.service;

import com.simplecoding.simpledms.jpa.filedblikes.dto.FileDbLikesDto;
import com.simplecoding.simpledms.jpa.gallerylikes.dto.GalleryLikesDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class GalleryLikesServiceTest {

    @Autowired
    GalleryLikesService galleryLikesService;


    @Test
    void save() {

        // 1)준비
        GalleryLikesDto galleryLikesDto  = new GalleryLikesDto();
        galleryLikesDto.setEmail("forbob@naver.com");
        galleryLikesDto.setUuid("12345672");
        galleryLikesDto.setLikeCount((long) 1);

        // 2)실행
        galleryLikesService.save(galleryLikesDto);

        //3) 검증
        //DB에서 확인

    }
}


