package com.simplecoding.simpledms.common;

import com.simplecoding.simpledms.auth.dto.MemberDto;
import com.simplecoding.simpledms.auth.entity.Member;
import com.simplecoding.simpledms.dept.dto.DeptDto;
import com.simplecoding.simpledms.dept.entity.Dept;
import com.simplecoding.simpledms.emp.dto.EmpDto;
import com.simplecoding.simpledms.emp.entity.Emp;
import com.simplecoding.simpledms.faq.dto.FaqDto;
import com.simplecoding.simpledms.faq.entity.Faq;
import com.simplecoding.simpledms.filedb.dto.FileDbDto;
import com.simplecoding.simpledms.filedb.entity.FileDb;
import com.simplecoding.simpledms.gallery.dto.GalleryDto;
import com.simplecoding.simpledms.gallery.entity.Gallery;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",                                                 // spring 과 연결
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE // null 제외 기능(update 시 사용)
)
public interface MapStruct {
//    TODO: 여기서 할것: 각 업무별로 함수명 정하기
//         -> 라이브러리가 알아서 그 함수명으로 복사해 줍니다.
//    TODO: 1) 부서: Dept <-> DeptDto
    DeptDto toDto(Dept dept);
    Dept toEntity(DeptDto deptDto);
//    TODO: 더티 체킹용 수정 함수: @MappingTarget 꼭 사용할 것
    void updateFromDto(DeptDto deptDto, @MappingTarget Dept dept);

//    TODO: 2) 사원: Emp(참조키:Dept dept) <-> EmpDto(참조키:Long dno)
    @Mapping(source = "dept.dno", target = "dno")
    EmpDto toDto(Emp emp);
    @Mapping(source = "dno", target = "dept.dno")
    Emp toEntity(EmpDto empDto);
    //    TODO: 더티 체킹용 수정 함수: @MappingTarget 꼭 사용할 것
    void updateFromDto(EmpDto empDto, @MappingTarget Emp emp);


//    TODO: 3) Faq: Faq <-> FaqDto (서로 복사)

     FaqDto toDto(Faq faq);
    Faq toEntity(FaqDto faqDto);
    void updateFromDto(FaqDto faqDto, @MappingTarget Faq faq);


    //TODO: 4) FileDb:  FileDb <-> FileDbDto  (서로 복사)
    FileDbDto toDto(FileDb fileDb);
    @Mapping(target = "fileData",ignore = true)   // fileData 필드는 복사 무시하세요 라는 뜻
    FileDb toEntity(FileDbDto fileDbDto);


    //TODO: 5) Gallery:  Gallery <-> GalleryDto  (서로 복사)
    GalleryDto toDto(Gallery gallery);
    @Mapping(target = "galleryData",ignore = true)   // galleryData 필드는 복사 무시하세요 라는 뜻
    Gallery toEntity(GalleryDto galleryDto);


    //TODO: 6) Member: Member <-> MemberDto (서로복사)
    MemberDto toDto(Member member);
    Member toEntity(MemberDto memberDto);

}
