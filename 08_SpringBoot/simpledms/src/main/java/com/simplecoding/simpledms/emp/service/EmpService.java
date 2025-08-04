package com.simplecoding.simpledms.emp.service;

import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.dept.entity.Dept;
import com.simplecoding.simpledms.dept.repository.DeptRepository;
import com.simplecoding.simpledms.emp.dto.EmpDto;
import com.simplecoding.simpledms.emp.entity.Emp;
import com.simplecoding.simpledms.emp.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class EmpService {
    //    생성자 DI
    private final EmpRepository empRepository;
    private final MapStruct mapStruct;       // 복사 라이브러리
    private final ErrorMsg errorMsg;         // 에러메세지 화면표시 클래스
    private final DeptRepository deptRepository;

    //    퀴즈: 전체조회 : dto 빼고 코딩(엔티티 전체조회)
    public Page<EmpDto> selectEmpList(String searchKeyword,
                                      Pageable pageable) {
        Page<Emp> page = empRepository.selectEmpList(searchKeyword, pageable);
        return page.map(data -> mapStruct.toDto(data));
    }

    //    퀴즈: 추가
    public void save(EmpDto empDto) {
        Emp emp = mapStruct.toEntity(empDto);
        empRepository.save(emp);
    }

    //    TODO: 상세조회: JPA 기본메소드(sql 작성 없음)
    public EmpDto findById(long eno) {
        Emp emp=empRepository.findById(eno)
                .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
        return mapStruct.toDto(emp);
    }


    //복사 라이브러리: mapStruct(요즘추천),
    //              단 연관관계 필드는 update 시 수정되지 않음,(수작업 추가)
    @Transactional
    public void updateFromDto(EmpDto empDto) {
//        더티 체킹 수정 코딩법: 1) 상세조회(DB값)
        Emp emp = empRepository.findById(empDto.getEno())
                .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
//                            2) setter 이용해서 값 수정(dto -> 엔티티로 수정): 복사라이브러리(MapStruct)
        mapStruct.updateFromDto(empDto, emp);
        // 🔥 수동으로 참조키(dept) 설정
        //  1. 직접코딩=> new Emp()만들어서 기본키만 넣고 setter 수정
        //  2. 부서정보(dname,loc) 모두 필요하다면 부서 상세조회해서  setter 수정
        Dept dept = new Dept();
        dept.setDno(empDto.getDno());
        emp.setDept(dept);
    }


    public void deleteById(long eno) {
        empRepository.deleteById(eno);
    }
}
