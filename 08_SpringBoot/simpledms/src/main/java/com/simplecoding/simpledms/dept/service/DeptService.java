package com.simplecoding.simpledms.dept.service;


import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.dept.entity.Dept;
import com.simplecoding.simpledms.dept.repository.DeptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


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






}
