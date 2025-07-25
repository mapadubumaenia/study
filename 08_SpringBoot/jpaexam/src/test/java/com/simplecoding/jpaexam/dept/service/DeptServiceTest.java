package com.simplecoding.jpaexam.dept.service;

import com.simplecoding.jpaexam.dept.dto.DeptDto;
import com.simplecoding.jpaexam.dept.entity.Dept;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;


@Log4j2               // TODO: 로깅, 디버깅 용
@SpringBootTest       // TODO: 스프링부트에서 JUNIT 테스트할 때 붙임
@EnableJpaAuditing    // TODO: 생성일시,수정일시 만들어주는 어노테이션
class DeptServiceTest {

    //    TODO: 필드 DI (JUNIT)
    @Autowired
    private DeptService deptService;

    @Test
    void findById() {
//        TODO: 1) 테스트 조건
        long dno=20;
//        2) 실제 실행 : 결과: 엔티티 -> DTO 수정
        DeptDto deptDto=deptService.findById(dno);
//        TODO: 1) 검증: log.info(), assert 함수 등
        log.info(deptDto);
        // 참고) 밑의 assert 함수는 2값을 비교해서 맞으면 성공, 틀리면 실패로 표시해줌
        // 사용법: assertEquals(예상값,실제값)
 //       assertEquals("RESEARCH", deptDto.getDname());

    }

    @Test
    void findAll() {
        List<DeptDto> deptDtos=deptService.findAll();
      //  2) 실제 실행 : 결과: 엔티티 -> DTO 수정
         log.info(deptDtos);
        //        TODO: 1) 검증: log.info(), assert 함수 등


    }

    @Test
    void testFindAll() {
//        사용법 : Pageable pageable= PageRequest.of(현재페이지번호, 화면에보일개수);
        Pageable pageable= PageRequest.of(0, 3); // 테스트 용
        Page<DeptDto> page=deptService.findAll(pageable);
        log.info(page);
//     JPA 페이징 결과 클래스:Page (Dept클래스, 총건수, 현재페이지 등)
//        log.info(page.getContent());  //List<Dept>클래스

    }

    @Test
    void insert() {
        // 테스트 준비
        DeptDto deptDto=new DeptDto();
        deptDto.setDname("개발부");
        deptDto.setLoc("서울");
        //실행
        deptService.save(deptDto);

    }

    @Test
    void update() {
        // 테스트 준비
        // 수정 테스트: 기본키 넣어서 테스트
        DeptDto deptDto=new DeptDto();
        deptDto.setDno((long)10);
        deptDto.setDname("연구팀");
        deptDto.setLoc("서울");
        //실행
        deptService.save(deptDto);

    }





}
