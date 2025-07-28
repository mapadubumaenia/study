package com.simplecoding.jpaexam.emp.dto;

import lombok.*;

//sum,avg,max,min 을 위한 DTO
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpStatsDto {
    private Long sum;
    private Double avg;
    private Long max;
    private Long min;
}
