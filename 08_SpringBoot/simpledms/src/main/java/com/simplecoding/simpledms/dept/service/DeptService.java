package com.simplecoding.simpledms.dept.service;


import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.dept.entity.Dept;
import com.simplecoding.simpledms.dept.repository.DeptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


//목적: 업무로직(기능)을 작성하는 곳
//TODO: Spring(인터페이스,자식클래스)
//     Springboot (클래스)
// DI:  1)필드 DI: @Autowired 를 필드에서 붙여서 사용
//       2) 생성자 DI(추천) : 매개변수 1개짜리 생성자를 만들어서 사용



@Service
@RequiredArgsConstructor
public class DeptService {
// 생성자 DI
   private  final DeptRepository deptRepository;

   private final MapStruct mapStruct;
   private final ErrorMsg errorMsg;
// 전체조회(페이징처리): like검색
//  spring 매개변수(criteria), 결과(PagenationInfo)
//   JPA: 매개변수(Pageable),  결과(Page)
// 조회: DB결과 ->엔티티클래스 -> DTO 복사 -> DTO로 화면에 표시
    // 예) dto.dno=dept.dno (복사) =>이런식으로 다 해야하지만 번거롭기에 라이브러리 사용(MapStruct)
    //TODO: page.map(data->mapStruct.toDto(data)); 의미
    //   => 스트림(자동반복문), for문으로 모두 변경(엔티티->DTO)
    //  stream.map(): 배열의 끝까지 자동 반복 실행
    public Page<DeptDto> selectDeptList(String searchkeyword, Pageable pageable){
        Page<Dept> page=deptRepository.selectDeptList(searchkeyword,pageable);
       return page.map(data->mapStruct.toDto(data));
    }


    //추가: save(): 기본메소드(sql 코딩 필요없음)
    // 조회에서는 DB결과 ->엔티티저장 ->DTO복사 ->화면표시
    // 추가는  :화면입력 ->DTO저장 ->엔티티복사 ->DB저장
    public void save(DeptDto deptDto){
        Dept dept=mapStruct.toEntity(deptDto);
        deptRepository.save(dept);
    }

    //상세조회  JPA 기본메소드 (SQL 작성 없음)
    public DeptDto findById(Long dno){
        //optional 레퍼클래스: NUll을 다루는 편리한 메소드를 가지고 있는 클래스
        //  의미: findById(상세조회) 햿는데 결과가 null이면 정보없음 이라고 화면에 표시
        //   아니면 dept 변수에 결과가 저장됨
    Dept dept=deptRepository.findById(dno)
            .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
        return mapStruct.toDto(dept);
}




}
