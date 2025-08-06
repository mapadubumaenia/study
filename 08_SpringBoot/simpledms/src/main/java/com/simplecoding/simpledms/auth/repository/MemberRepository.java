package com.simplecoding.simpledms.auth.repository;


import com.simplecoding.simpledms.auth.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//상속 사용법: 인터페이스명 extends JpaRepository<엔티티클래스,기본키자료형>
@Repository
public interface MemberRepository extends JpaRepository<Member,String> {




}
