package com.simplecoding.simpledms.emp.service;


import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.dept.entity.Dept;
import com.simplecoding.simpledms.emp.dto.EmpDto;
import com.simplecoding.simpledms.emp.entity.Emp;
import com.simplecoding.simpledms.emp.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpService {

    //생성자 DI
    private final EmpRepository empRepository;

    private final MapStruct mapStruct;

    // 전체조회(페이징처리): like검색
//  spring 매개변수(criteria), 결과(PagenationInfo)
//   JPA: 매개변수(Pageable),  결과(Page)
// 조회: DB결과 ->엔티티클래스 -> DTO 복사 -> DTO로 화면에 표시
    // 예) dto.dno=dept.dno (복사) =>이런식으로 다 해야하지만 번거롭기에 라이브러리 사용(MapStruct)
    //TODO: page.map(data->mapStruct.toDto(data)); 의미
    //   => 스트림(자동반복문), for문으로 모두 변경(엔티티->DTO)
    //  stream.map(): 배열의 끝까지 자동 반복 실행
    public Page<EmpDto> selectEmpList(String searchkeyword, Pageable pageable){
        Page<Emp> page=empRepository.selectEmpList(searchkeyword,pageable);
        return page.map(data ->mapStruct.toDto(data));

    }


    //추가: save(): 기본메소드(sql 코딩 필요없음)
    // 조회에서는 DB결과 ->엔티티저장 ->DTO복사 ->화면표시
    // 추가는  :화면입력 ->DTO저장 ->엔티티복사 ->DB저장
    public void save(EmpDto empDto){
        Emp emp=mapStruct.toEntity(empDto);
        empRepository.save(emp);
    }




}
