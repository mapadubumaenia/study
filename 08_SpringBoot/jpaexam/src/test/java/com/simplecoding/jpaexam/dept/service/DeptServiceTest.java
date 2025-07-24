package com.simplecoding.jpaexam.dept.service;

import com.simplecoding.jpaexam.dept.entity.Dept;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Log4j2                    //TODO: 로깅, 디버깅 용
@SpringBootTest            //TODO: 스프링부트에서 JUNIT 테스트할 때 붙임
@EnableJpaAuditing         //TODO: 생성일시, 수정일시 만들어주는 어노테이션
class DeptServiceTest {

    //TODO: 필드 DI(JUNIT)
    @Autowired
    private DeptService deptService;

    @Test
    void findById() {
        //TODO:  1)테스트 조건
            long dno=20;
        //TODO:  2)실제실행
           Dept dept = deptService.findById(dno);
        //TODO:  3)검증: log.info(), assert 함수 등
        log.info(dept);

    }
}