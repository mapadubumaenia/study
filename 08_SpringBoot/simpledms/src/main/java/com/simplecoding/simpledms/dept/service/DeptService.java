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
import org.springframework.transaction.annotation.Transactional;

// 목적: 업무로직(기능)을 작성하는 곳
// TODO: spring (인터페이스,자식클래스)
//       springboot(클래스)
//  DI : 1) 필드 DI  : @Autowired 를 필드에서 붙여서 사용
//       2) 생성자 DI(추천): 매개변수 1개짜리 생성자를 만들어서 사용
@Service
@RequiredArgsConstructor
public class DeptService {
//    생성자 DI
    private final DeptRepository deptRepository;
    private final MapStruct mapStruct;       // 복사 라이브러리
    private final ErrorMsg errorMsg;         // 에러메세지 화면표시 클래스

//    전체조회(페이징): like 검색
//    spring: 매개변수(Criteria), 결과(PagenationInfo)
//    JPA   : 매개변수(Pageable), 결과(Page:결과배열, 현재페이지번호 등)
//    조회: DB 결과 -> 엔터티클래스 -> DTO 복사(생략) -> DTO로 화면에 표시
//     예)  dto.dno=dept.dno (복사) , 복사 라이브러리(엔티티 <-> DTO:MapStruct)
//    TODO: page.map(data->mapStruct.toDto(data)); 의미
//      스트림(자동반복문), for문으로 모두 변경(엔티티 -> DTO)
//      stream.map(실행문): 배열의 끝까지 자동 반복 실행
    public Page<DeptDto> selectDeptList(String searchKeyword,
                                        Pageable pageable) {
        Page<Dept> page=deptRepository.selectDeptList(searchKeyword, pageable);
        return page.map(data->mapStruct.toDto(data));
    }

//    TODO: 추가: save() : 기본메소드(sql 코딩 필요없음)
//    조회 : db결과->엔티티 저장->DTO 복사->화면표시
//    추가: 화면입력->DTO 저장->엔티티 복사-> DB저장
    public void save(DeptDto deptDto) {
        Dept dept=mapStruct.toEntity(deptDto);
        deptRepository.save(dept);
    }

//    TODO: 상세조회: JPA 기본메소드(sql 작성 없음)
    public DeptDto findById(long dno) {
//        Optional 레퍼클래스: Null 을 다루는 편리한 메소드를 가지고 있는 클래스
//        의미: findById(상세조회) 했는데 결과가 null 이면 정보없음 이라고 화면에표시
//             아니면 dept 변수에 결과가 저장됨
        Dept dept=deptRepository.findById(dno)
                .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
        return mapStruct.toDto(dept);
    }
    
//    TODO 수정: 1) save() 재사용: dto 에 기본키값이(dno) 있으면 수정(update)됩니다.
//                               없으면 insert 됩니다.
//              2) dirty checking(추천): save() 함수 이용안함, setter 로 값을 수정하면
//                                 JPA 가 전에 값과 비교해서 다르면 update합니다.
//                                 같으면 안합니다.
//                                  (단, 메소드 위에 @Transactional 붙일것)
    @Transactional
    public void updateFromDto(DeptDto deptDto) {
//        더티 체킹 수정 코딩법: 1) 상세조회(DB값)
        Dept dept=deptRepository.findById(deptDto.getDno())
                .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
//                            2) setter 이용해서 값 수정(dto -> 엔티티로 수정): 복사라이브러리(MapStruct)
        mapStruct.updateFromDto(deptDto, dept);
    }

//    삭제
    public void deleteById(long dno) {
        deptRepository.deleteById(dno);
    }
}

















