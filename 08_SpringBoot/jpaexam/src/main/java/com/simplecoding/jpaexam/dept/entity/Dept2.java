package com.simplecoding.jpaexam.dept.entity;

import com.simplecoding.jpaexam.common.BaseTimeEntity;
import com.simplecoding.jpaexam.emp.entity.Emp2;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity

@Table(name="TB_DEPT2")

@SequenceGenerator(
        name = "SQ_DEPT2_JPA",
        sequenceName = "SQ_DEPT2",
        allocationSize=1
)
//TODO: 롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "emp2")  //순환에러 방지(emp2 필드는 화면에 표시하지 마세요)

@EqualsAndHashCode(of = "dno", callSuper = false)
public class Dept2 extends BaseTimeEntity {

    @Id           //TODO: 기본키임을 알려주는 어노테이션(필수)
    @GeneratedValue(strategy = GenerationType.SEQUENCE      //TODO:해당 필드에 오라클 시퀀스 사용
                    ,generator = "SQ_DEPT2_JPA")             // JPA 시퀀스명 지정
    private Long dno;     //TODO:기본키, 시퀀스
    private String dname;
    private String loc;

    // TODO: 양방향 조인(연관관계)   부서(1) :사원(N)
    // 사용법: @OneToMany (mappedBy = "사원엔티티참조키필드명")
    @OneToMany(mappedBy = "dept2")
    List<Emp2> emp2=new ArrayList<>();

    // TODO: 장점: 예) Dept2 dept2=new dept2();
    //                dept2.emp2.eno 조회 가능
    //        단점: 순환에러  1)순환에러    =>  dept2.emp2.dept2.emp2.=>무한루프
    //                       2) 값을 추가/수정/삭제하면: 한쪽만(emp만, dept만 함)
    //                          =>하지만 양방향이 걸리면 양쪽 모두 추가/수정/삭제 2번씩 해야함
    //                          => insert:dept.save(); emp.save() 처럼 2번해야함=>매우 비효율

}
