package com.simplecoding.jpaexam.emp.service;

import com.simplecoding.jpaexam.common.MapStruct;
import com.simplecoding.jpaexam.emp.dto.EmpDto;
import com.simplecoding.jpaexam.emp.entity.Emp;
import com.simplecoding.jpaexam.emp.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpService {
    private final EmpRepository empRepository;
    //    mapStruct DI
    private final MapStruct mapStruct;

    //    상세조회 -> DTO 사용 상세조회
//    예외 처리 추가 : null 일 경우 예외처리
    public EmpDto findById(long eno) {
        Emp emp = empRepository.findById(eno)
                .orElseThrow(() -> new RuntimeException("정보 없음"));
        return mapStruct.toDto(emp);
    }

    //전체조회  페이징없는것 ,
    public List<EmpDto> findAll() {
        List<Emp> list = empRepository.findAll();
        return list.stream()
                .map(data -> mapStruct.toDto(data))     //가공(자동 반복 엔티티->DTO)
                .toList();                                                //데이터 짜집기
    }


    //전체조회 페이징 있는것
    public Page<EmpDto> findAll(Pageable pageable) {
        Page<Emp> page = empRepository.findAll(pageable);
        return page.map(emp -> mapStruct.toDto(emp));
    }


   // 저장
    public void save(EmpDto empDto) {
        Emp emp = mapStruct.toEntity(empDto);
        empRepository.save(emp);
    }




}
