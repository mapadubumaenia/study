package com.simplecoding.jpaexam.emp.repository;

import com.simplecoding.jpaexam.emp.dto.EmpStatsDto;
import com.simplecoding.jpaexam.emp.entity.Emp;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepository extends JpaRepository<Emp,Long> {
    //    TODO: SQL 직접 작성하기(JPQL)
//    예제 1) 부서 테이블에서 부서명(dname), 위치(loc)를 매개변수로 받아 조회
    // TODO: 달라지는점(SQl->jpql) : (1)     *   -> 엔티티 별명              * => d
    //                              (2) 테이블명 -> 엔티티 클래스명(대소문자 구분)   tb_dept  =>Dept
    //                              (3) 컬럼명 -> 엔티티 필드명      ex)d.dname   d.loc
    //                              (4) 기타 select,from 등은 동일하게 코딩
    //                              (5) sql 함수 ==jpql 함수명과 거의 비슷
    // 페이징: 매개변수(pageable)
    @Query(value ="select e from Emp e\n" +
            "where e.commission is null\n" +
            "and e.salary >=:salary")
    Page<Emp> selectByCommissionAndSalary(@Param("commission") Long commission,
                                   @Param("salary") Long salary, Pageable pageable);


    // 예제 2) like 검색
    //  문제) N+1 발생-> 해결: 조인으로 유도(@EnittyGraph)
    @EntityGraph(attributePaths = {"dept"})
    @Query(value = "select e from Emp e\n" +
            "where e.ename like %:searchkeyword%")
    Page<Emp> selectAll(@Param("searchkeyword") String searchkeyword, Pageable pageable);



    // 예제 3)   사원테이블의 부서번호를 sum, avg, max, min 값을 화면에 표시
    //      단, sum(Long), avg(Double), max(Long), min(Long)
    //  => 담을 공간(용기): DTO 필요(새로 만들기)
    // 사용법: select new 풀클래스 생성자(sum(e.salary), avg(e.salary), max(e.salary),min(e.salary)from tb_emp e)

    @Query(value = "select new com.simplecoding.jpaexam.emp.dto.EmpStatsDto(sum(e.salary), avg(e.salary), max(e.salary),min(e.salary))\n" +
            "from Emp e")
    EmpStatsDto selectGroup();


    // 예제4 bulkdelete
    @Transactional
    @Modifying
    @Query(value = "delete Emp e where e.eno=:eno")
    void bulkDelete(@Param("eno")long eno);



}
