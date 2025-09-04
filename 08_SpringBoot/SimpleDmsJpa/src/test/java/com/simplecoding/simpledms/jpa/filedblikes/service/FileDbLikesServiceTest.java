package com.simplecoding.simpledms.jpa.filedblikes.service;

import com.simplecoding.simpledms.jpa.filedblikes.dto.FileDbLikesDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class FileDbLikesServiceTest {

    @Autowired
    FileDbLikesService fileDbLikesService;

    @Test
    void save() {
        // 1)준비
        FileDbLikesDto fileDbLikesDto  = new FileDbLikesDto();
        fileDbLikesDto.setEmail("forbob@naver.com");
        fileDbLikesDto.setUuid("12345672");
        fileDbLikesDto.setLikeCount((long) 1);

        // 2)실행
        fileDbLikesService.save(fileDbLikesDto);

        //3) 검증
        //DB에서 확인

    }
}