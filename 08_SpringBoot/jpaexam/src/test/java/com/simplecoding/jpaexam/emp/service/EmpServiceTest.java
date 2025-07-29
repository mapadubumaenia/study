package com.simplecoding.jpaexam.emp.service;

import com.simplecoding.jpaexam.emp.dto.EmpDto;
import com.simplecoding.jpaexam.emp.dto.EmpStatsDto;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;
import java.util.List;

@Log4j2               //  로깅, 디버깅 용
@SpringBootTest       //  스프링부트에서 JUNIT 테스트할 때 붙임
@EnableJpaAuditing    //  생성일시,수정일시 만들어주는 어노테이션
class EmpServiceTest {

    @Autowired
    private EmpService empService;

    @Test
    @Transactional     //  참조키 걸린 클래스는 붙일것
    void findById() {
        //        TODO: 1) 테스트 조건
        long eno=8000;
//        실제 실행: 엔티티 -> DTO 수정
        EmpDto empDto=empService.findById(eno);
//        TODO: 1) 검증: log.info(), assert 함수 등
        log.info(empDto);
    }

    @Test
    @Transactional     //  참조키 걸린 클래스는 붙일것
    void findAll() {
        List<EmpDto> empDtos = empService.findAll();
        log.info(empDtos);
    }


    @Test
    void testFindAll() {
        Pageable pageable= PageRequest.of(0, 3); // 테스트 용
        Page<EmpDto> page=empService.findAll(pageable);
        log.info(page);
        log.info(page.getContent());
    }

    @Test
    void insert() {
        //테스트 준비
        // 추가(insert) 기본키는 생략(시퀀스가 만드니까)
        EmpDto empDto=new EmpDto();
        empDto.setEname("MAFA");
        empDto.setJob("student");
        empDto.setManager((long)1545);
        empDto.setHiredate(LocalDate.now());
        empDto.setSalary((long)1557);
        empDto.setCommission((long)1557);
        empDto.setDno((long)10);
        // 실행
        empService.save(empDto);
    }


    @Test
    void update() {
        //테스트 준비
        // 기본키를 추가해서 수정
        EmpDto empDto=new EmpDto();
        empDto.setEno((long)8020);
        empDto.setEname("MAFA");
        empDto.setJob("student");
        empDto.setManager((long)7788);
        empDto.setHiredate(LocalDate.now());
        empDto.setSalary((long)6000);
        empDto.setCommission((long)1000);
        empDto.setDno((long)10);
        // 실행
        empService.save(empDto);
    }


    @Test
    void updateFromDto() {
        EmpDto empDto=new EmpDto();
        empDto.setEno((long)8020);
        empDto.setEname("Shin");
        empDto.setJob("student");
        empDto.setManager((long)8000);
        empDto.setHiredate(LocalDate.now());
        empDto.setSalary((long)8800);
        empDto.setCommission((long)1200);
        empDto.setDno((long)10);
        // 실행
        empService.updateFromDto(empDto);



    }

    @Test
    void deleteById() {
        empService.deleteById(8020);
    }

    @Test
    void selectByCommissionAndSalary() {
        //  1  테스트 준비
        Long commission = null;
        Long salary     = 1000L;
        Pageable pageable= PageRequest.of(0, 3);

        // 2 실행
        Page<EmpDto> page=empService.selectByCommissionAndSalary(commission,salary,pageable);
        // 3 결과확인
        log.info(page);
        log.info(page.getContent());
    }

    @Test
    @Transactional
    void selectAll() {
        String searchkeyword = "J";
        Pageable pageable= PageRequest.of(0, 3);
        Page<EmpDto> page=empService.selectAll(searchkeyword,pageable);
        log.info(page);
        log.info(page.getContent());
    }

    @Test
    void selectGroup() {
        EmpStatsDto  empStatsDto=empService.selectGroup();
        log.info(empStatsDto);
    }


    @Test
    void bulkDelete() {
        empService.bulkDelete((long)8013);
    }
}