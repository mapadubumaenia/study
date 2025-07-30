package com.simplecoding.simpledms.emp.repository;


import com.simplecoding.simpledms.emp.entity.Emp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//TODO  목적: 실제CRUD(추가/조회/수정/삭제)를 위한 메소드 또는 SQL를 만드는곳
//@Repository  :@service와 비슷, IOC를 위한 어노테이션
// Inversion of Control(제어의 역전)=> 애플리케이션에서 객체를 직접 생성·관리하지 않고, 프레임워크가 대신 생성·관리해 주는 것 , DI(의존성 주입)
// AOP(공통기능을 분리해서 사용하게 해주는 기능, @ControllerAdviser)
// JPA 클래스 또는 인터페이스를 상속받으면 기본 메소드를 모두 사용가능
//TODO: 상속 사용법: 인터페이스명  extends JpaRepository<엔티티클래스명, 기본키자료형>
@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {
//TODO: like 검색은 기본메소드에 없음, 직접 작성하기
    //    TODO: 달라지는 점(sql->jpql): (1) *       -> 엔티티 별명
//                                (2) 테이블명 -> 엔티티 클래스명(대소문자 구분)
//                                (3) 컬럼명   -> 엔티티 필드명
//                                (4) 기타 select, from 등은 동일하게 코딩
//                                 (대소문자 구분: 엔티티명, 필드명(자바에 해당되는것들)
//                                (5) sql 함수 == jpql 함수명과 거의 비슷

    @Query(value = "select e from Emp e\n" +
            "where e.ename like %:searchkeyword%")
    Page<Emp> selectEmpList(@Param("searchkeyword")String searchkeyword, Pageable pageable);



}
