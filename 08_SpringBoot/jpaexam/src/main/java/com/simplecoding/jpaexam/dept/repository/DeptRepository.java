package com.simplecoding.jpaexam.dept.repository;

import com.simplecoding.jpaexam.dept.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//TODO: IOC =>스프링부트를 실행하면 해당 클래스/인터페이스 생성함(빈으로 등록됨)
//예) @Service, @Component, @Mapper @Repository 등
//  상속: 부모클래스//인터페이스의 재산을 모두 사용가능
//  =>할수 있는것(기본메소드) : 1)상세조회 2)전체조회 3)추가 4)수정 5)삭제  완전 쫭이자나~
//   (위의 것들은 sql 코딩 필요 없음)
//    상속사용법: 인터페이스 extends JpaRepository<엔티티클래스명,기본키자료형>
@Repository
public interface DeptRepository extends JpaRepository<Dept,Long> {


}
