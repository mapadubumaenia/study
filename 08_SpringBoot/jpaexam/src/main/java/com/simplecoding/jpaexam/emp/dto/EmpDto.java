package com.simplecoding.jpaexam.emp.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpDto {


    private Long eno;
    private String ename;
    private String job;
    private Long manager;
    @DateTimeFormat(pattern ="yyyy-MM-dd")    //TODO: 날짜포맷 지정하는 어노테이션
    private LocalDate hiredate;
    private Long salary;
    private Long commission;
    //TODO: 참조키(dno):
    private Long dno;
//    만약 dname, loc 추가 하면 -> 부서 select 추가 실행됨
    private String dname;
//    private Long dname;
}

