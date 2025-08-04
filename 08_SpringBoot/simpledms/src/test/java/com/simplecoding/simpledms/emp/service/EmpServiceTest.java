package com.simplecoding.simpledms.emp.service;

import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.dept.service.DeptService;
import com.simplecoding.simpledms.emp.dto.EmpDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2                 // 결과 확인용 어노테이션
@SpringBootTest         // 스프링부트용 Junit 테스트 어노테이션
@EnableJpaAuditing      // 생성일시,수정일시에 값 넣어주는 어노테이션
class EmpServiceTest {
    //    테스트 시 필드 DI
    @Autowired
    EmpService empService;

    @Test
    void selectEmpList() {
//        1) 테스트 준비
        String searchKeyword = "";
//      사용법: PageRequest.of(현재페이지번호, 화면에보이는개수)
        Pageable pageable = PageRequest.of(0, 3);
//        2) 실행
        Page<EmpDto> page=empService.selectEmpList(searchKeyword,pageable);
//        3) 결과 확인
        log.info(page.getContent()); // 결과 배열 확인
    }

    @Test
    void save() {
        //        1) 테스트 조건
        EmpDto empDto=new EmpDto();
        empDto.setEname("홍길동");
        empDto.setJob("부장");
        empDto.setManager((long)8000);
        empDto.setHiredate(LocalDate.now());
        empDto.setSalary((long)5000);
        empDto.setCommission((long)2000);
        empDto.setDno((long)40);   // 참조키(dno 있는걸로 테스트)
//        2) 실행
        empService.save(empDto);
//        3) 검증: DB확인
    }

    @Test
    void findById() {
//        1) 테스트 조건(준비):
        long eno=8004;
//        2) 실행
        EmpDto empDto=empService.findById(eno);
//        3) 검증
        log.info(empDto);
    }

    @Test
    void updateFromDto() {
//        1) 테스트 조건(준비)
        EmpDto empDto=new EmpDto();
        empDto.setEno((long)8004);
        empDto.setEname("홍길동");
        empDto.setJob("부장");
        empDto.setManager((long)8000);
        empDto.setHiredate(LocalDate.now());
        empDto.setSalary((long)5000);
        empDto.setCommission((long)2000);
        empDto.setDno((long)20);
//        2) 실행
        empService.updateFromDto(empDto);
//        3) 검증: db
    }

    @Test
    void deleteById() {
        long eno=8004;
        empService.deleteById(eno);
    }
}














