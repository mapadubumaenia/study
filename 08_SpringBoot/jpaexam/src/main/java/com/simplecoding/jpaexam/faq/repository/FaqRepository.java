package com.simplecoding.jpaexam.faq.repository;

import com.simplecoding.jpaexam.faq.entity.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FaqRepository extends JpaRepository<Faq,Long> {
}
