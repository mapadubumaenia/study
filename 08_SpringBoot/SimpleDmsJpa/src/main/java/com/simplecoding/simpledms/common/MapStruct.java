package com.simplecoding.simpledms.common;

import com.simplecoding.simpledms.es.lookup.dto.LookupAllDto;
import com.simplecoding.simpledms.es.lookup.entity.LookupALL;
import com.simplecoding.simpledms.es.search.dto.SearchAllDto;
import com.simplecoding.simpledms.es.search.entity.SearchAll;
import com.simplecoding.simpledms.jpa.auth.dto.Member2Dto;
import com.simplecoding.simpledms.jpa.auth.entity.Member2;
import com.simplecoding.simpledms.jpa.dept.dto.DeptDto;
import com.simplecoding.simpledms.jpa.dept.entity.Dept;
import com.simplecoding.simpledms.jpa.emp.dto.EmpDto;
import com.simplecoding.simpledms.jpa.emp.entity.Emp;
import com.simplecoding.simpledms.jpa.faq.dto.FaqDto;
import com.simplecoding.simpledms.jpa.faq.entity.Faq;
import com.simplecoding.simpledms.jpa.filedb.dto.FileDbDto;
import com.simplecoding.simpledms.jpa.filedb.entity.FileDb;
import com.simplecoding.simpledms.jpa.filedblikes.dto.FileDbLikesDto;
import com.simplecoding.simpledms.jpa.filedblikes.entity.FileDbLikes;
import com.simplecoding.simpledms.jpa.gallery.dto.GalleryDto;
import com.simplecoding.simpledms.jpa.gallery.entity.Gallery;
import com.simplecoding.simpledms.jpa.gallerylikes.dto.GalleryLikesDto;
import com.simplecoding.simpledms.jpa.gallerylikes.entity.GalleryLikes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE  // null 제외 기능(update 시 사용)
)
public interface MapStruct {

    // TODO: 1) Dept <-> DeptDto
    DeptDto toDto(Dept dept);
    Dept toEntity(DeptDto deptDto);
    // TODO: 수정 시 사용: dirty checking 기능(save() 없이 수정 가능)
    void updateFromDto(DeptDto deptDto, @MappingTarget Dept dept);

    // TODO: 2) Emp <-> EmpDto
    @Mapping(source = "dept.dno", target = "dno")
    EmpDto toDto(Emp emp);
    @Mapping(source = "dno", target = "dept.dno")
    Emp toEntity(EmpDto empDto);
    // TODO: 수정 시 사용: dirty checking 기능(save() 없이 수정 가능)
//      경고 무시하고 싶으면 아래 추가하세요
    void updateFromDto(EmpDto empDto, @MappingTarget Emp emp);

    // TODO: 3) Dept <-> DeptDto
    FaqDto toDto(Faq faq);
    Faq toEntity(FaqDto faqDto);
    // TODO: 수정 시 사용: dirty checking 기능(save() 없이 수정 가능)
    void updateFromDto(FaqDto faqDto, @MappingTarget Faq faq);

    //    TODO: 4) fileDb <-> fileDto
    FileDbDto toDto(FileDb fileDb);
    @Mapping(target = "fileData", ignore = true)
    FileDb toEntity(FileDbDto fileDbDto);

    //    TODO: 5) gallery <-> galleryDto
    GalleryDto toDto(Gallery gallery);
    @Mapping(target = "galleryData", ignore = true)
    Gallery toEntity(GalleryDto galleryDto);

    //    TODO: 6) member <-> memberDto
    Member2Dto toDto(Member2 member2);
    Member2 toEntity(Member2Dto member2Dto);

    // TODO : 엘라스틱 서치용
    //TODO :6-2 FileDbLikes<-> FileDbLikesDto
    // 참조키매핑 해야힘  1) member.email -> email
    //                  2) fileDb.uuid -> uuid
    @Mapping(source = "member2.email", target = "email")
    @Mapping(source = "fileDb.uuid", target = "uuid")
    FileDbLikesDto toDto(FileDbLikes fileDbLikes);
    @Mapping(source = "email", target = "member2.email")
    @Mapping(source = "uuid", target = "fileDb.uuid")
    FileDbLikes toEntity(FileDbLikesDto fileDbLikesDto);

    //TODO: 6-3
    // TODO : 엘라스틱 서치용
    //TODO :6-2 GalleryLikes<-> GalleryLikesDto
    // 참조키매핑 해야힘  1) member.email -> email
    //                  2) fileDb.uuid -> uuid
    @Mapping(source = "member2.email", target = "email")
    @Mapping(source = "gallery.uuid", target = "uuid")
    GalleryLikesDto toDto(GalleryLikes galleryLikes);
    @Mapping(source = "email", target = "member2.email")
    @Mapping(source = "uuid", target = "gallery.uuid")
    GalleryLikes toEntity(GalleryLikesDto galleryLikesDto);

    // TODO : 엘라스틱 서치용
    //TODO :7 SearchAll<-> SearchAllDto
    SearchAllDto toDto(SearchAll searchAll);
    SearchAll toEntity(SearchAllDto searchAllDto);


    // TODO : 엘라스틱 서치용
    //TODO :8 LookupAll<-> LookupAllDto
    LookupAllDto toDto(LookupALL lookupAll);
    LookupALL toEntity(LookupAllDto lookupAllDto);





}
