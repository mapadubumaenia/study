package com.simplecoding.simpledms.emp.dto;

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
    private LocalDate hiredate;          //날짜 포맷 지정("yyyy-mm-dd")
    private Long salary;
    private Long commission;
    // TODO: 참조키 필드:dno(TB_EMP) , 이것을 그냥 DB테이블과 비슷하게 필드를 만드세요
    //   DNO NUMBER
    private Long dno;

}
