package com.simplecoding.jpaexam.dept.dto;


import lombok.*;


//TODO:엔티티를 가공하거나 필드를 생략하거나 할때 사용하는 클래스
//    예) 부서필드: 부저명, 부서위치(생략)
//TODO: 롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeptDto {
    //TODO: 엔티티 클래스를 보고 만들면 됩니다.
    private Long dno;     //TODO:기본키, 시퀀스
    private String dname;
    private String loc;

}
