package com.simplecoding.jpaexam.emp.service;

import com.simplecoding.jpaexam.common.MapStruct;
import com.simplecoding.jpaexam.emp.dto.EmpDto;
import com.simplecoding.jpaexam.emp.dto.EmpStatsDto;
import com.simplecoding.jpaexam.emp.entity.Emp;
import com.simplecoding.jpaexam.emp.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    @Transactional
    //dirty checking 기능 이용 수정
    // 참고: @Transactional : SQL 문이 여러개 있을 경우 commit을 가장 마지막에 실행해 주는 어노테이션
    public void updateFromDto(EmpDto empDto) {
        //  1) JPA 메모리 조회 올림: 상세조회
        Emp emp = empRepository.findById(empDto.getEno())
                .orElseThrow(() -> new RuntimeException("정보 없음"));
        //  2) setter 이용 값 수정: deptDto 값을 모두 수정
        //     mapStruct 이용(더티체킹 지원)
        //  예) dept.dname=depeDto.dname;        //엔티티에 dto 값 복사
        mapStruct.updateFromDto(empDto, emp);

    }


    // 삭제
    public void deleteById(long eno) {
        empRepository.deleteById(eno);
    }


    // TODO: SQL직접 작성 함수들
    public Page<EmpDto> selectByCommissionAndSalary(Long commission, Long salary, Pageable pageable) {
        Page<Emp> page=empRepository.selectByCommissionAndSalary(commission, salary,pageable);
        return page.map(data -> mapStruct.toDto(data));
    }

    // 2) like 검색 DTO 사용
    public Page<EmpDto> selectAll(String searchkeyword, Pageable pageable) {
        Page<Emp> page=empRepository.selectAll(searchkeyword,pageable);
        return page.map(data -> mapStruct.toDto(data));
    }


    //3
    public EmpStatsDto selectGroup(){
        return empRepository.selectGroup();
    }

    // 예제4번 bulkdelete
    public void bulkDelete(long eno){
        empRepository.deleteById(eno);
    }

}
