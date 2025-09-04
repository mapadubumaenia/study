package com.simplecoding.simpledms.es.search.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SearchAllDto {
    private String id;     //기본키, 문서id
    private String type;   //구분 (emp,dept구분)
    private String dname;  //부서명
    private String loc;    //부서위치
    private String ename;  //사원이름
    private String job;    //직위


}
