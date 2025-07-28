package com.simplecoding.jpaexam.dept.service;

import com.simplecoding.jpaexam.common.MapStruct;
import com.simplecoding.jpaexam.dept.dto.DeptDto;
import com.simplecoding.jpaexam.dept.dto.DeptStatsDto;
import com.simplecoding.jpaexam.dept.entity.Dept;
import com.simplecoding.jpaexam.dept.repository.DeptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// JPA 라이브러리 기본 메소드: 1) 조회(전체, 상세) 2) 저장 3) 수정 4) 삭제 제공
//                          ( sql 코딩 필요 없음 )
// 게시판 만들기: 1) 조회(전체, 상세) 2) 저장 3) 수정 4) 삭제



@Service
@RequiredArgsConstructor
public class DeptService {
    //    TODO: 레포지토리 DI(클래스 가져오기) 방법
//      1) @Autowired 를 필드위에 붙이기
//      2) 생성자를 이용해서 하기(숙련자용, 추천)
    private final DeptRepository deptRepository;
    //    mapStruct DI
    private final MapStruct mapStruct;

    //    상세조회 -> DTO 사용 상세조회
//    Optional 래퍼 클래스: null 을 다루는 편리한 메소드가 있음
//     get() : 옵셔널 클래스에 값 꺼내기 함수
//    RuntimeException 예외처리 클래스: try~catch, throws 할 필요없음
    public DeptDto findById(long dno) {
//      null 일경우 강제 예외 발생시킴
        Dept dept = deptRepository.findById(dno)
                .orElseThrow(() -> new RuntimeException("정보 없음"));
        return mapStruct.toDto(dept);
    }

    //    전체 조회 : 1) 페이징 없는 것
//               2) 엔티티 결과 -> DTO 전체조회 수정(주의: 결과가 여러개임 -> 반복문 실행)
//               3) 간단 코딩: 자동반복문(스트림: forEach, map 함수 등, 람다식을 사용(->))
    public List<DeptDto> findAll() {
        List<Dept> list = deptRepository.findAll();
//        TODO: 람다 사용법: 예) int 함수명(a){return 결과;} => 람다식: a-> 결과
//        TODO: 사용법 : list.stream()                           // 준비
//                          .map(dept -> mapStruct.toDto(dept)) // 가공(데이터 수정(반복됨))
//                          .toList();                          // 데이터 짜집기
        return list.stream()
                .map(dept -> mapStruct.toDto(dept))
                .toList();
    }

    //전체조회: 1)페이징 있는 것 + DTO 사용 (최종 추천)
    // 과거 spring   :매개변수(criteria) , Controller/JSP(결과:PagenationInfo)
    // 현 springboot :(JPA 안에 페이징 클래스 제공) 매개변수()
    public Page<DeptDto> findAll(Pageable pageable) {
        Page<Dept> page = deptRepository.findAll(pageable);
        return page.map(dept -> mapStruct.toDto(dept));
    }


    //    저장  1)엔티티 저장 (추가)
    //    조회: DB 데이터-> 엔티티 담기 ->DTO 복사 -> 화면 전송       이 순서임
    //   vs 저장: 화면입력 ->DTO 담기 -> 엔티티 복사  -> DB저장       저장이랑 반대순서
    public void save(DeptDto deptDto) {
        Dept dept = mapStruct.toEntity(deptDto);
        deptRepository.save(dept);
    }


    //   수정(update) : 1)save() 재사용: 기본키를 전달(dno=10)
    //                                  => 기본키가 없으면(insert) , 있으면(update)
    //                 2) dirty checking 기능:
    //                    (1) JPA 원리: JPA 자기네들의 고유 메모리 영역(컨테이너)
    //                         조회 결과: 임시 저장(캐싱 위해)
    //                          캐싱: 같은 조회시 DB에서 다시 조회하지 않고 메모리에서 꺼내씀(속도 향상)
    //                     (2) 1번 조회한 결과가 있기 때문에 수정 요청시 기존 가지고 있는 결과와(메모리 영역)
    //                           수정요청 데이터가 다르면 자동으로 update 문을 실행함 (save() 함수를 실행하지 않아도 update문이 날아감(특징))
    //                           결론: save() 함수 실행하지 않고 update 실행됨(판단: 데이터가 조금이라도 다르면)
    //                           활용: 예) 엔티티.dname="개발"  -> 엔티티.dname="개발2"   => dirty checking으로 인해 update 실행
    //                                (setter 함수 이용)

    //dirty checking 기능 이용 수정
    // 참고: @Transactional : SQL 문이 여러개 있을 경우 commit을 가장 마지막에 실행해 주는 어노테이션
    @Transactional
    public void updateFromDto(DeptDto deptDto) {
         //  1) JPA 메모리 조회 올림: 상세조회
        Dept dept = deptRepository.findById(deptDto.getDno())
                .orElseThrow(() -> new RuntimeException("정보 없음"));

        //  2) setter 이용 값 수정: deptDto 값을 모두 수정
        //     mapStruct 이용(더티체킹 지원)
        //  예) dept.dname=depeDto.dname;        //엔티티에 dto 값 복사
        mapStruct.updateFromDto(deptDto, dept);
       }

       //삭제
       public void deleteById(long dno) {
        deptRepository.deleteById(dno);
       }


       // TODO: SQL직접 작성 함수들
    //   1) DTO사용
       public Page<DeptDto> selectByDnameAndLoc(String dname, String loc,Pageable pageable) {
         Page<Dept> page=deptRepository.selectByDnameAndLoc(dname, loc,pageable);
         return page.map(data -> mapStruct.toDto(data));
       }


       // 2) like 검색 DTO 사용
    public Page<DeptDto> sellectAll(String searchkeyword,Pageable pageable) {
        Page<Dept> page=deptRepository.selectAll(searchkeyword,pageable);
        return page.map(data -> mapStruct.toDto(data));
    }

    // 3)
    public DeptStatsDto selectGroup(){
        return deptRepository.selectGroup();
    }

}
