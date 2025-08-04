package com.simplecoding.simpledms.emp.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

// 퀴즈: DTO 만들기
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpDto {
//    필드는 엔티티 클래스를 참고해서 만드세요
    private Long eno;        // 기본키, 시퀀스
    private String ename;
    private String job;
    private Long manager;
    private LocalDate hiredate;
    private Long salary;
    private Long commission;
//    TODO: 참조키 필드: dno(TB_EMP), 이것은 DB 테이블과 비슷하게 필드를 만드세요
//    DNO	NUMBER
    private Long dno;
}
