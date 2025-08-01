package com.simplecoding.simpledms.dept.service;

import com.simplecoding.simpledms.dept.dto.DeptDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static org.junit.jupiter.api.Assertions.*;


@Log4j2              //결과확인용 어노테이션
@SpringBootTest       // 스프링부트용 Junit 테스트 어노테이션
@EnableJpaAuditing     //생성일시 수정일시에 값 넣어주는 어노테이션
class DeptServiceTest {
      //  테스트 시 필드 DI
      @Autowired
      DeptService deptService;

        @Test
        void selectDeptList() {
            // 1)테스트 준비
            String searchkeyword ="R";
            // 사용법:  PageRequest.of(현재페이지번호, 화면에보이는개수);
            Pageable pageable= PageRequest.of(0, 3);
            // 2)실행
            Page<DeptDto> page=deptService.selectDeptList(searchkeyword,pageable);
            // 3)결과확인
            log.info(page.getContent());  //결과배열확인
    }

    @Test
    void save() {
        //  1)테스트조건
           DeptDto deptDto=new DeptDto();
           deptDto.setDname("개발부2");
           deptDto.setLoc("서울");
        //  2)실행
           deptService.save(deptDto);
        //  3)검증
        log.info(deptDto);
    }

    @Test
    void findById() {
            //테스트조건
        long dno=30;
        // 실행
        DeptDto deptDto=deptService.findById(dno);
        //3 검증
        log.info(deptDto);
    }
}