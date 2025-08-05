package com.simplecoding.simpledms.qna.entity;


import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity                           // JPA 관리클래스로 만드는 어노테이션
@Table(name = "TB_QNA")          // DB 테이블과 클래스를 연결하는 어노테이션
@SequenceGenerator(               // DB시퀀스, JPA시퀀스 2개를 설정
        name = "SQ_QNA_JPA",     // JPA시퀀스 이름
        sequenceName = "SQ_QNA", // DB시퀀스 이름
        allocationSize = 1        // 동기화설정(DB 1개 증가하면 똑같이 증가설정)
)
// 롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "qno", callSuper = false)
public class Qna extends BaseTimeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_QNA_JPA")     // JPA시퀀스이름 넣기
    private Long qno;
    private String questioner;
    private String question;
    private String answer;
    private String answerer;



}


