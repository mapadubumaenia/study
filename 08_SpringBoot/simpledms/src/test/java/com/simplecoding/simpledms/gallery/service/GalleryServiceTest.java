package com.simplecoding.simpledms.gallery.service;

import com.simplecoding.simpledms.gallery.dto.GalleryDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Log4j2                 // 결과 확인용 어노테이션
@SpringBootTest         // 스프링부트용 Junit 테스트 어노테이션
@EnableJpaAuditing
class GalleryServiceTest {


    @Autowired
    GalleryService galleryService;


    @Test
    void selectGalleryList() {

        //        1) 테스트 준비
        String searchKeyword = "";
//      사용법: PageRequest.of(현재페이지번호, 화면에보이는개수)
        Pageable pageable = PageRequest.of(0, 3);
//        2) 실행
        Page<GalleryDto> page=galleryService.selectGalleryList(searchKeyword, pageable);
//        3) 결과 확인
        log.info(page.getContent()); // 결과 배열 확인

    }


    }
