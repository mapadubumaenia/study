package com.simplecoding.simpledms.es.lookup.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LookupAllDto {

    private String id;     //기본키, 문서id
    private String type;   //구분 (emp,dept구분)
    private String title;  //부서명
    private String content;    //부서위치
    private String question;  //사원이름
    private String answer;    //직위
}
