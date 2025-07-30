package com.simplecoding.simpledms.emp.entity;


import com.simplecoding.simpledms.common.BaseTimeEntity;
import com.simplecoding.simpledms.dept.entity.Dept;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity                                      //JPA 관리 클래스로 만드는 어노테이션
@Table(name = "TB_EMP")                      //DB 테이블과 클래스를 연결하는 어노테이션
@SequenceGenerator(                           //DB시퀀스, JPA시퀀스 2개를 설정
        name="SQ_EMP_JPA",                    //=> JPA 시퀀스 이름
        sequenceName = "SQ_EMP",              //=> DB  시퀀스 이름
        allocationSize = 1                     // 동기화 설정(DB가 1개 증가하면 똑같이 JPA시퀀스도 증가)
)

//롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "eno", callSuper = false)  //of="기본키", callSuper = false(부모필드는 제외)
                                                   // 의미: dno 만으로 equals,hashCode 함수를 만들겠다는 의미
public class Emp extends BaseTimeEntity {
    @Id                                   //필드위에 붙이고, 기본키임을 지정하는 어노테이션
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_EMP_JPA")          //JPA 시퀀스 이름 넣기
    private Long eno;
    private String ename;
    private String job;
    private Long manager;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate hiredate;          //날짜 포맷 지정("yyyy-mm-dd")
    private Long salary;
    private Long commission;
    //TODO: 참조키 걸기(연관관계 설정(N:1):JPA:EMP<->DEPT)
    //  =>기본옵셥으로 하면 :무조건 조인해버림 => 성능저하
    @ManyToOne(fetch = FetchType.LAZY)                 // =>조인하지 말고 각자 select 실행하다가 조인할일이 생기면 조인하라는 명령어
    @JoinColumn(name = "dno")                         // DB 참조키 컬럼 이름넣기
    private Dept dept;

}
