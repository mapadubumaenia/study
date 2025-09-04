package com.simplecoding.simpledms.es.search.service;

import com.simplecoding.simpledms.es.search.dto.SearchAllDto;
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
class SearchAllServiceTest {

    @Autowired
    SearchAllService searchAllService;
    
    
    @Test
    void search() {
        // 1)준비: 1페이지(0),3(화면 게시물 개수)
        Pageable pageable = PageRequest.of(0,3);
        String keyword = "scott";
        
        //2) 실행
        Page<SearchAllDto> page = searchAllService.search(keyword, pageable);
      
        
        
        //3) 결과확인: page 객체에 content에 결과가 있음
        log.info(page.getContent());
        
    }

    @Test
    void match() {

        // 1)준비: 1페이지(0),3(화면 게시물 개수)
        Pageable pageable = PageRequest.of(0,3);
        String keyword = "sales";

        //2) 실행
        Page<SearchAllDto> page = searchAllService.match(keyword, pageable);



        //3) 결과확인: page 객체에 content에 결과가 있음
        log.info(page.getContent());




    }

    @Test
    void term() {
        // 1)준비: 1페이지(0),3(화면 게시물 개수)
        Pageable pageable = PageRequest.of(0,3);
        String keyword = "CLERK";

        //2) 실행
        Page<SearchAllDto> page = searchAllService.term(keyword, pageable);



        //3) 결과확인: page 객체에 content에 결과가 있음
        log.info(page.getContent());


    }
}