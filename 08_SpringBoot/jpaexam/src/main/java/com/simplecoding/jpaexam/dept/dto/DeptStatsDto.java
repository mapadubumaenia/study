package com.simplecoding.jpaexam.dept.dto;

import lombok.*;

//sum,avg,max,min 을 위한 DTO
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeptStatsDto {
    private Long sum;
    private Double avg;
    private Long max;
    private Long min;





}
