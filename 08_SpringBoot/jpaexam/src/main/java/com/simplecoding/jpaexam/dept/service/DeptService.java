package com.simplecoding.jpaexam.dept.service;


import com.simplecoding.jpaexam.dept.entity.Dept;
import com.simplecoding.jpaexam.dept.repository.DeptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeptService {
    //TODO: 레포지토리 DI (클래스가져오기)방법
    // 1) @Autowired를 필드위에 붙이기
    // 2) 생성자를 이용해서 하기 ==>(숙련자용)  (롬북사용해서 @RequiredArgsConstructor 하면 더욱 짧게 코드사용가능)

    private final DeptRepository deptRepository;


    //TODO: 상세조회
    public Dept findById(long dno){
        Dept dept = deptRepository.findById(dno).get();
        return dept;
    }

}
