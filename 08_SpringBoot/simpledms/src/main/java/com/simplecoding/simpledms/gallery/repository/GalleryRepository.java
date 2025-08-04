package com.simplecoding.simpledms.gallery.repository;


import com.simplecoding.simpledms.gallery.entity.Gallery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery,String> {

    // TODO: like 검색(sql 직접 작성)
    //    TODO: 달라지는 점(sql->jpql): (1) *       -> 엔티티 별명
//                                (2) 테이블명 -> 엔티티 클래스명(대소문자 구분)
//                                (3) 컬럼명   -> 엔티티 필드명
//                                (4) 기타 select, from 등은 동일하게 코딩
//                                 (대소문자 구분: 엔티티명, 필드명(자바에 해당되는것들)
//                                (5) sql 함수 == jpql 함수명과 거의 비슷
    @Query(value = "select g from Gallery g\n" +
            "where g.galleryTitle like %:searchKeyword%")
    Page<Gallery> selectGalleryList(@Param("searchKeyword") String searchKeyword,
                                  Pageable pageable);


}
