package com.simplecoding.simpledms.jpa.gallerylikes.entity;

import com.simplecoding.simpledms.common.BaseTimeEntity;
import com.simplecoding.simpledms.jpa.auth.entity.Member2;
import com.simplecoding.simpledms.jpa.filedb.entity.FileDb;
import com.simplecoding.simpledms.jpa.gallery.entity.Gallery;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "TB_GALLERY_LIKES")
@SequenceGenerator(
        name = "SQ_GALLERY_LIKES_JPA",
        sequenceName = "SQ_GALLERY_LIKES",
        allocationSize = 1
)
//롬북어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "id", callSuper = false)
public class GalleryLikes extends BaseTimeEntity {

    //  TB_GALLERY_LIKES 테이블보고 필드 정의
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_GALLERY_LIKES_JPA"
    )
    private long id;                       //기본키
    private long likeCount;                //좋아요 숫자(1번만 클릭 가능)

    //단방향 조인: 1):email(fk), TB_MEMBER(Member): 부모
    // 관계: 2) N:1 관계(좋아요테이블: 회원테이블)
    @ManyToOne(fetch = FetchType.LAZY)   //필요할때 조인하는 옵션(성능때문에)
    @JoinColumn(name = "email")           // DB FK 컬럼명 작성
    private Member2 member2;                 // 부모 엔티티 클래스명

    // 단방향 조인 2): uuid(fk), TB_GALLERY(FileDb): 부모
    // 관계: 2) N:1 관계(좋아요테이블: 업로드테이블)
    @ManyToOne(fetch = FetchType.LAZY)   //필요할때 조인하는 옵션(성능때문에)
    @JoinColumn(name = "uuid")           // DB FK 컬럼명 작성
    private Gallery gallery;              // 부모 엔티티 클래스명


}
