package com.simplecoding.jpaexam.dept.repository;

import com.simplecoding.jpaexam.dept.dto.DeptStatsDto;
import com.simplecoding.jpaexam.dept.entity.Dept;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//TODO: IOC =>스프링부트를 실행하면 해당 클래스/인터페이스 생성함(빈으로 등록됨)
//예) @Service, @Component, @Mapper @Repository 등
//  상속: 부모클래스//인터페이스의 재산을 모두 사용가능
//  =>할수 있는것(기본메소드) : 1)상세조회 2)전체조회 3)추가 4)수정 5)삭제  완전 쫭이자나~
//   (위의 것들은 sql 코딩 필요 없음)
//    상속사용법: 인터페이스 extends JpaRepository<엔티티클래스명,기본키자료형>
@Repository
public interface DeptRepository extends JpaRepository<Dept,Long> {
//    TODO: SQL 직접 작성하기(JPQL)
//    예제 1) 부서 테이블에서 부서명(dname), 위치(loc)를 매개변수로 받아 조회
    // TODO: 달라지는점(SQl->jpql) : (1)     *   -> 엔티티 별명              * => d
    //                              (2) 테이블명 -> 엔티티 클래스명(대소문자 구분)   tb_dept  =>Dept
    //                              (3) 컬럼명 -> 엔티티 필드명      ex)d.dname   d.loc
    //                              (4) 기타 select,from 등은 동일하게 코딩
    //                              (5) sql 함수 ==jpql 함수명과 거의 비슷
    // 페이징: 매개변수(pageable)
    @Query(value ="select d from Dept d\n" +
            "where d.dname=:dname\n" +
            "and d.loc = :loc")
    Page<Dept> selectByDnameAndLoc(@Param("dname") String dname,
                                   @Param("loc") String loc, Pageable pageable);


    // 예제 2) like 검색
    @Query(value = "select d from Dept d\n" +
            "where d.dname like %:searchkeyword%")
    Page<Dept> selectAll(@Param("searchkeyword") String searchkeyword,Pageable pageable);



    // 예제 3)   부서테이블의 부서번호를 sum, avg, max, min 값을 화면에 표시
    //      단, sum(Long), avg(Double), max(Long), min(Long)
    //  => 담을 공간(용기): DTO 필요(새로 만들기)
    // 사용법: select new 풀클래스 생성자(sum(d.dno), avg(d.dno), max(d.dno),min(d.dno)from tb_dept d)
    @Query(value = "select new com.simplecoding.jpaexam.dept.dto.DeptStatsDto(sum(d.dno), avg(d.dno), max(d.dno),min(d.dno))\n" +
            "from Dept d")
    DeptStatsDto selectGroup();


}
