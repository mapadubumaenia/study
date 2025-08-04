package com.simplecoding.simpledms.emp.entity;

import com.simplecoding.simpledms.common.BaseTimeEntity;
import com.simplecoding.simpledms.dept.entity.Dept;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

// 퀴즈: 엔티티 클래스 만들기
//    단, 참조키(dno) 빼고 만드세요
// JPA 어노테이션
@Entity
@Table(name = "TB_EMP")
@SequenceGenerator(
        name = "SQ_EMP_JPA",
        sequenceName = "SQ_EMP",
        allocationSize = 1
)
// 롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "eno", callSuper = false)
public class Emp extends BaseTimeEntity {
//    TB_EMP 테이블의 컬럼을 참고해서 만드세요
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_EMP_JPA")     // JPA시퀀스이름 넣기
    private Long eno;        // 기본키, 시퀀스
    private String ename;
    private String job;
    private Long manager;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate hiredate;     // 날짜 포맷 지정("yyyy-MM-dd")
    private Long salary;
    private Long commission;
//    TODO: 참조키 걸기(연관관계 설정(N:1): JPA: Emp <-> Dept )
//     => 기본옵션: 무조건 조인합니다.(성능 저하)
//     => FetchType.LAZY : 조인하지 말고 각자 select 실행하시오
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dno")  // DB 참조키 컬럼 이름넣기
    private Dept dept;
}
