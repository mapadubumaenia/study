package com.simplecoding.simpledms.es.lookup.service;

import com.simplecoding.simpledms.es.lookup.dto.LookupAllDto;
import com.simplecoding.simpledms.es.search.service.SearchAllService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class LookupAllServiceTest {

    @Autowired
    SearchAllService searchAllService;
    @Autowired
    private LookupAllService lookupAllService;


    @Test
    void search() {

        // 1)준비: 1페이지(0),3(화면 게시물 개수)
        Pageable pageable = PageRequest.of(0,3);
        String keyword = "제목";

        //2) 실행
        Page<LookupAllDto> page = lookupAllService.search(keyword, pageable);



        //3) 결과
        log.info(page.getContent());




    }

    @Test
    void match() {

        // 1)준비: 1페이지(0),3(화면 게시물 개수)
        Pageable pageable = PageRequest.of(0,3);
        String keyword = "제목";

        //2) 실행
        Page<LookupAllDto> page = lookupAllService.search(keyword, pageable);



        //3) 결과
        log.info(page.getContent());
    }

    @Test
    void term() {

        // 1)준비: 1페이지(0),3(화면 게시물 개수)
        Pageable pageable = PageRequest.of(0,3);
        String keyword = "제목";

        //2) 실행
        Page<LookupAllDto> page = lookupAllService.term(keyword, pageable);



        //3) 결과
        log.info(page.getContent());



    }
}