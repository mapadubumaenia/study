package com.simplecoding.jpaexam.common;

import com.simplecoding.jpaexam.dept.dto.DeptDto;
import com.simplecoding.jpaexam.dept.entity.Dept;
import com.simplecoding.jpaexam.emp.dto.EmpDto;
import com.simplecoding.jpaexam.emp.entity.Emp;
import com.simplecoding.jpaexam.faq.dto.FaqDto;
import com.simplecoding.jpaexam.faq.entity.Faq;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

//MapStruct 설정 파일
@Mapper(componentModel = "spring",                                                 //Springboot환경연결
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE  // null 제외 기능(update 시 사용)
)
public interface MapStruct {
    //TODO: 부서용

    //  1)엔티티->DTO 복사(결과)
    DeptDto toDto(Dept dept);
    //  2)DTO -> 엔티티 복사(결과)
    Dept toEntity(DeptDto deptDto);
    //  3)dirty checking 함수 정의
    //  사용법: void 함수명(Dto 변수, @MappingTarget 엔티티변수 )
    void updateFromDto(DeptDto deptDto, @MappingTarget Dept dept);

    // TODO:사원용:(참조키(연관관계))
    //   1)엔티티->DTO 복사(결과) , dept.dno=dno
    @Mapping(source = "dept.dno", target = "dno")
    @Mapping(source = "dept.dname", target = "dname")
    EmpDto toDto(Emp emp);
    //  2)DTO -> 엔티티 복사(결과)
    @Mapping(source ="dno",target ="dept.dno")
    @Mapping(source ="dname",target ="dept.dname")
    Emp toEntity(EmpDto empDto);
    //  3)dirty checking 함수 정의
    //  사용법: void 함수명(Dto 변수, @MappingTarget 엔티티변수 )
    void updateFromDto(EmpDto empDto, @MappingTarget Emp emp);

    //    TODO: Faq용
//  1)엔티티->DTO 복사(결과)
    FaqDto toDto(Faq faq);
    //  2)DTO -> 엔티티 복사(결과)
    Faq toEntity(FaqDto faqDto);
    //  3)dirty checking 함수 정의
    //  사용법: void 함수명(Dto 변수, @MappingTarget 엔티티변수 )
    void updateFromDto(FaqDto faqDto, @MappingTarget Faq faq);
}
