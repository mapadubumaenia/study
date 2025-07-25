package com.simplecoding.jpaexam.emp.entity;

import com.simplecoding.jpaexam.common.BaseTimeEntity;
import com.simplecoding.jpaexam.dept.entity.Dept;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

//TODO: JPA는 참조키 걸리면 (연관관계가 작성되면)
//   1) 사원컬럼만 조회하면 : 사원select됨
//   2 부서 칼럼도 포함해서 조회하면: 사원+부서 select2번 이상 조회됨
//    해결방법: 1) DTO에서 순수하게 사원 컬럼(필드)만 포함 (부서의 기본키는 넣어도됨. 다른키 넣으면 2번조회되버림)
//      2)실제 개발자가 직접 조인 쿼리 작성
//     3) 어노테이션을 이용한 조인방법
@Entity
@Table(name="TB_EMP")
@SequenceGenerator(
        name = "SQ_EMP_JPA",
        sequenceName = "SQ_EMP",
        allocationSize=1
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "eno", callSuper = false)
public class Emp extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                             generator ="SQ_EMP_JPA" )
    private Long eno;
    private String ename;
    private String job;
    private Long manager;
    @DateTimeFormat(pattern ="yyyy-MM-dd")    //TODO: 날짜포맷 지정하는 어노테이션
    private LocalDate hiredate;
    private Long salary;
    private Long commission;
//TODO: 참조키 설정(*) : dno(컬럼명)
    // 기본설정: 성능느림(무조건 조인해서 실행하기 때문)
    //    =>옵션변경:FetchType (상황에 따라 조인함 기본적으론 조인안함)
    // 단방향 조인: 추천)아래처럼 자식클래스만 하기
    @ManyToOne(fetch = FetchType.LAZY)     //TODO: N(자기자신) : 1(부서엔티티)관계표시
    @JoinColumn(name = "dno")              //TODO: 사용법: @JoinColumn(name = "DB참조키 컬럼멸")
    private Dept dept;                     // 부서엔티티 필드명



}
