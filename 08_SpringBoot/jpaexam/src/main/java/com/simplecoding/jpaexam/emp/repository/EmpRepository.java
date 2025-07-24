package com.simplecoding.jpaexam.emp.repository;

import com.simplecoding.jpaexam.emp.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepository extends JpaRepository<Emp,Long> {
}
