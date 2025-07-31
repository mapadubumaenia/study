package com.simplecoding.simpledms.emp.service;

import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.emp.dto.EmpDto;
import com.simplecoding.simpledms.emp.repository.EmpRepository;
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

@Log4j2
@SpringBootTest
@EnableJpaAuditing
class EmpServiceTest {

    @Autowired
    EmpService empService;

    @Test
    void selectEmpList() {

        // 1)테스트 준비
        String searchkeyword ="R";
        // 사용법:  PageRequest.of(현재페이지번호, 화면에보이는개수);
        Pageable pageable= PageRequest.of(0, 3);
        // 2)실행
        Page<EmpDto> page=empService.selectEmpList(searchkeyword,pageable);
        // 3)결과확인
        log.info(page.getContent());  //결과배열확인


    }

    @Test
    void save() {
        EmpDto empDto=new EmpDto();
        empDto.setEname("MAFA");
        empDto.setJob("Cook");
        empDto.setManager((long)8000);
        empDto.setHiredate(LocalDate.now());
        empDto.setSalary((long)8800);
        empDto.setCommission((long)800);
        empDto.setDno((long)10);

        //실행
        empService.save(empDto);
        //검사
        log.info(empDto);
    }
}