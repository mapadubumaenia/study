package com.simplecoding.simpledms.faq.repository;

import com.simplecoding.simpledms.dept.entity.Dept;
import com.simplecoding.simpledms.faq.entity.Faq;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// TODO: 상속 사용법: 인터페이스명 extends JpaRepository<엔티티클래스명, 기본키자료형>
//  상속하면 JPA 기본메소드 5개를 사용할 수 있습니다.(sql을 자동으로 만들어서 실행합니다.)
@Repository
public interface FaqRepository extends JpaRepository<Faq, Long> {
    //    TODO: like 검색 (기본메소드 없음, 직접 작성)
//    TODO: 달라지는 점(sql->jpql): (1) *       -> 엔티티 별명
//                                (2) 테이블명 -> 엔티티 클래스명(대소문자 구분)
//                                (3) 컬럼명   -> 엔티티 필드명
//                                (4) 기타 select, from 등은 동일하게 코딩
//                                 (대소문자 구분: 엔티티명, 필드명(자바에 해당되는것들)
//                                (5) sql 함수 == jpql 함수명과 거의 비슷
//     인텔리제이 자동정렬: ctrl+alt+l
//  TODO: spring 페이징(마이바티스) : 매개변수(Criteria), 결과(PagenationInfo)
//        springboot(JPA)        :  매개변수(Pageable), 결과(Page)
    @Query(value = "select f from Faq f\n" +
            "where f.title like %:searchKeyword%")
    Page<Faq> selectFaqList(@Param("searchKeyword") String searchKeyword,
                              Pageable pageable);
}
