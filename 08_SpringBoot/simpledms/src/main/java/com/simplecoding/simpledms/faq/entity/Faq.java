package com.simplecoding.simpledms.faq.entity;

import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

// 마무리 퀴즈: 엔티티, DTO, 레포지토리,서비스,컨트롤러
//        1) 전체조회(like 검색) 기능 구현
// TODO: 엔티티 클래스: JPA 라이브러리가 sql 을 자동으로 만들때 참고하는 클래스
//  JPA 장점: 1) 기본메소드는 sql 자동으로 만들어서 실행해 줍니다., 코딩효율성 증가합니다.
//             또한 직접 sql 작성하고 싶을때 기능도 제공합니다.
//  참고) VO 작성과 비슷: TB_FAQ 테이블을 보고 작성
// JPA 어노테이션
@Entity                           // JPA 관리클래스로 만드는 어노테이션
@Table(name = "TB_FAQ")           // DB 테이블과 클래스를 연결하는 어노테이션
@SequenceGenerator(               // DB시퀀스, JPA시퀀스 2개를 설정
        name = "SQ_FAQ_JPA",      // JPA시퀀스 이름
        sequenceName = "SQ_FAQ",  // DB시퀀스 이름
        allocationSize = 1        // 동기화설정(DB 1개 증가하면 똑같이 증가설정)
)
// 롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "fno", callSuper = false) // of="기본키", callSuper = false(부모필드는 제외)
// 의미: fno만으로 equals, hashCode 함수를 만들겠다는 의미
public class Faq extends BaseTimeEntity {
//    TB_FAQ 테이블을 보고 작성
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_FAQ_JPA")     // JPA시퀀스이름 넣기
    private Long fno;                     // 기본키, 시퀀스
    private String title;
    private String content;
}
