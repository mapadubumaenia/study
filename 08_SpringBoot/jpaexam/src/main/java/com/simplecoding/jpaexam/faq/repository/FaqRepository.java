package com.simplecoding.jpaexam.faq.repository;

import com.simplecoding.jpaexam.faq.entity.Faq;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


// JPA 기본 메소드 1)상세조회 2)전체좆회 3)추가 4)수정 5)삭제
//  (SQL 코딩없이 함수만 실행하면 자동으로 SQL 만들어줌 => 존나편함)
//   JPA 상속받으면 할 수 있음: 레파지토리명 extends JPA Repasitory<엔티티클래스, 기본키자료형>
//   복잡 sql: 직접 작성
@Repository
public interface FaqRepository extends JpaRepository<Faq,Long> {
    //    TODO: SQL 직접 작성하기(JPQL)
//    예제 1) 부서 테이블에서 부서명(dname), 위치(loc)를 매개변수로 받아 조회
    // TODO: 달라지는점(SQl->jpql) : (1)     *   -> 엔티티 별명              * => d
    //                              (2) 테이블명 -> 엔티티 클래스명(대소문자 구분)   tb_dept  =>Dept
    //                              (3) 컬럼명 -> 엔티티 필드명      ex)d.dname   d.loc
    //                              (4) 기타 select,from 등은 동일하게 코딩
    //                              (5) sql 함수 ==jpql 함수명과 거의 비슷
    // 페이징: 매개변수(pageable)
    @Query(value = "select f from Faq f\n" +
            "where f.title = :title\n" +
            "and f.content = :content")
    Page<Faq> findByTitleAndContent(@Param("title") String title, @Param("content") String content , Pageable pageable);


    //like 검색
    @Query(value = "select f from Faq f\n" +
            "where f.title like %:searchkeyword%")
    Page<Faq> selectAll(@Param("searchkeyword") String searchkeyword, Pageable pageable);



}
