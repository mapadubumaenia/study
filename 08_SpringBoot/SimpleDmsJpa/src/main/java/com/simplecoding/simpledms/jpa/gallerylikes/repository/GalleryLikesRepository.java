package com.simplecoding.simpledms.jpa.gallerylikes.repository;

import com.simplecoding.simpledms.jpa.gallerylikes.entity.GalleryLikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryLikesRepository extends JpaRepository<GalleryLikes, Long> {
    // TODO: 좋아요를 이미 클릭헀는지 확인 쿼리: like_count 개수 증가
    //    email, uuid 값을 조회해서 1개이상 나오면 이미 좋아요 했음
    //    sql -> jpql 변경: 1) 테이블-> 엔티티, 컬럼->필드(대소문자 구분), *->별명

    @Query(value = "select count (gl) from GalleryLikes gl\n" +
            "where gl.member2.email=:email\n" +
            "and gl.gallery.uuid=:uuid")

    long countByEmailAndUuid(@Param("email") String email, @Param("uuid") String uuid);


}
