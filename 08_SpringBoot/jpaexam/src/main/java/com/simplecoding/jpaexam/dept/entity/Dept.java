package com.simplecoding.jpaexam.dept.entity;

import com.simplecoding.jpaexam.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

//TODO: JAP어노테이션
//TODO: 클래스 JPA 가 관리하는 클래스로 만드는 어노테이션
@Entity
//TODO:JPA 라이브러리에게 테이블명이 뭔지 알려주는 어노테이션
@Table(name="TB_DEPT")
//TODO: 시퀀스 관련 어노테이션
//    name="JPA 시퀀스명"
//   sequenceName="DB 시퀀스명"
//   allocationSize =1  ==> 1을줘야 둘이 동기화 되어 같이 올라가게 만듬
@SequenceGenerator(
        name = "SQ_DEPT_JPA",
        sequenceName = "SQ_DEPT",
        allocationSize=1
)
//TODO: 롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//TODO: (참고) dno 1개로 오버라이딩 메소드 만들기(기본키(유일)가 같으면 2개는 같다)
@EqualsAndHashCode(of = "dno", callSuper = false)
public class Dept extends BaseTimeEntity {
    //TODO: DB 테이블 보고 만들기: 컬럼명(자료형)
    // 자동 import: alt+enter
    //TODO: 생성일시,수정일시(공통 부모클래스)
    @Id           //TODO: 기본키임을 알려주는 어노테이션(필수)
    @GeneratedValue(strategy = GenerationType.SEQUENCE      //TODO:해당 필드에 오라클 시퀀스 사용
                    ,generator = "SQ_DEPT_JPA")             // JPA 시퀀스명 지정
    private Long dno;     //TODO:기본키, 시퀀스
    private String dname;
    private String loc;

}
