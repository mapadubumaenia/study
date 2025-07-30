package com.simplecoding.simpledms.dept.entity;

import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

//TODO: 목적: JPA관리하는 클래스, 이걸보고 자동으로 sql 만듬
@Entity                                      //JPA 관리 클래스로 만드는 어노테이션
@Table(name = "TB_DEPT")                      //DB 테이블과 클래스를 연결하는 어노테이션
@SequenceGenerator(                           //DB시퀀스, JPA시퀀스 2개를 설정
        name="SQ_DEPT_JPA",                    //=> JPA 시퀀스 이름
        sequenceName = "SQ_DEPT",              //=> DB  시퀀스 이름
        allocationSize = 1                     // 동기화 설정(DB가 1개 증가하면 똑같이 JPA시퀀스도 증가)
)
//롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "dno", callSuper = false) //of="기본키", callSuper = false(부모필드는 제외)
                                                  // 의미: dno 만으로 equals,hashCode 함수를 만들겠다는 의미

public class Dept extends BaseTimeEntity {
    //TB_DEPT 테이블을 참고해서 만드시오
    @Id                    //필드위에 붙이고, 기본키임을 지정하는 어노테이션
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "SQ_DEPT_JPA")           //JPA 시퀀스 이름 넣기
    private Long dno;     //기본키 시퀀스
    private String dname;    //부서명
    private String loc;      //부서위치
}
