package com.simplecoding.jpaexam.common;

import com.simplecoding.jpaexam.dept.dto.DeptDto;
import com.simplecoding.jpaexam.dept.entity.Dept;
import com.simplecoding.jpaexam.emp.dto.EmpDto;
import com.simplecoding.jpaexam.emp.entity.Emp;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
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

     // TODO:사원용:(참조키(연관관계))

     //   1)엔티티->DTO 복사(결과) , dept.dno=dno
    @Mapping(source = "dept.dno", target = "dno")
         EmpDto toDto(Emp emp);
    //  2)DTO -> 엔티티 복사(결과)
    @Mapping(source ="dno",target ="dept.dno")
       Emp toEntity(EmpDto empDto);

}
