package com.simplecoding.jpaexam.dept.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.simplecoding.jpaexam.dept.dto.DeptStatsDto;
import com.simplecoding.jpaexam.dept.entity.Dept;
import com.simplecoding.jpaexam.dept.entity.QDept;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.simplecoding.jpaexam.dept.entity.QDept.dept;

//Querydsl용 레포지토리
@Repository
@RequiredArgsConstructor
public class DeptRepositoryDsl {
    //querydsl 생성자 DI
    private  final JPAQueryFactory QueryFactory;
    private final JPAQueryFactory queryFactory;
    //Q클래스 넣기
    // 예) 코딩편의성을 높이기 위한 아래 생성자: from(QDept.dept) ->from(dept)로 쓸수 있다
    QDept qDept= dept;

    //TODO: 예제1) 부서 테이블에서 부서명, 위치를 매개변수로 받아 조회
     public Page<Dept> queryByDnameAndLoc(String dname, String loc, Pageable pageable){
        //  1)기본 조회 쿼리
        //   ->sql:  select * from tb_dept where dname=:dname and loc=:loc
        //            offset~limit
        List<Dept> content=QueryFactory
                .selectFrom(dept)
                .where(dept.dname.eq(dname).and(dept.loc.eq(loc)))
                .offset(pageable.getOffset())    //페이지 현재 시작번호(0)
                .limit(pageable.getPageSize())   //화면에 보일 갯수(3)
                .fetch();  // 여러건 실행

        //  2)전체 조회 쿼리 : select count() from tb_dept~
        long total=queryFactory
                .select(dept.count())
                .from(dept)
                .where(dept.dname.eq(dname).and(dept.loc.eq(loc)))
                .fetchOne();                   // 1개가 결과로 나오는 sql 실행

        // 사용법: return new PageImpl<>(전체조회결과,pafeable,전체개수)
        return new PageImpl<>(content,pageable,total);

    }
    //    querydsl 부서테이블의 부서번호를 sum, avg, max, min 값을 화면에 표시
    //    Dto 이용: DeptStatsDto
    //   sql: select sum(d.dno),avg(d.dno),max(d.dno),min(d.dno) from tb_dept
    public DeptStatsDto queryGroup(){
         return queryFactory
                 .select(
                         Projections.constructor(
                                 DeptStatsDto.class,
                                 dept.dno.sum(),
                                 dept.dno.avg(),
                                 dept.dno.max(),
                                 dept.dno.min()
                         )
                 )
                 .from(dept)
                 .fetchOne();
    }

    //  TODO: 예제3) 동적 sql(다이나믹 sql)
    //       dname 또는 loc 매개변수가 있으면 해당 조건만 검색
    //        둘다 없으면 전체 조회(다이나믹 쿼리)
    //     왜? JPA는 동적 sql 이 안됨
    @SuppressWarnings("DataFlowIssue")
    public Page<Dept> queryByDnameOrLoc(String dname, String loc, Pageable pageable) {
        //  동적 쿼리 조건 만들기
        BooleanBuilder builder = new BooleanBuilder();
        //  사용법: isBlank(): "" (빈글자) 또는 " " (공백 글자)를 말함
        if (dname != null && !dname.isBlank()) {
            builder.and(dept.dname.eq(dname));   //where dname = 값
        }
        if (loc != null && !loc.isBlank()) {
            builder.and(dept.loc.eq(loc));   //where loc = 값
        }
        //  1) 쿼리작성
        List<Dept> content = queryFactory
                .select(dept)
                .from(dept)
                .where(builder)
                .fetch();
        //  2) 전체개수
        long total=queryFactory
                .select(dept.count())
                .from(dept)
                .where(builder)
                .fetchOne();
        return new PageImpl<>(content,pageable,total);
    }
}
