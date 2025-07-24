package com.simplecoding.jpaexam.emp.service;

import com.simplecoding.jpaexam.emp.entity.Emp;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Log4j2                    //TODO: 로깅, 디버깅 용
@SpringBootTest            //TODO: 스프링부트에서 JUNIT 테스트할 때 붙임
@EnableJpaAuditing
class EmpServiceTest {

    @Autowired
    private EmpService empService;



    @Test
    @Transactional
    void findById() {

        //TODO:  1)테스트 조건
    long eno =8000;
        //TODO:  2)실제실행
    Emp emp = empService.findById(eno);
        //TODO:  3)검증: log.info(), assert 함수 등
        log.info(emp);
    }


}