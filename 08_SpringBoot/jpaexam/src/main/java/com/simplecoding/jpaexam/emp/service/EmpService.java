package com.simplecoding.jpaexam.emp.service;


import com.simplecoding.jpaexam.emp.entity.Emp;
import com.simplecoding.jpaexam.emp.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpService {

    private final EmpRepository empRepository;

    //TODO:상세조회
    public Emp findById(long eno){

        Emp emp = empRepository.findById(eno).get();
        return emp;
    }


}
