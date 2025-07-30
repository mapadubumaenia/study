package com.simplecoding.simpledms.faq.entity;


import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_FAQ")
@SequenceGenerator(
        name="SQ_FAQ_JPA",                    //=> JPA 시퀀스 이름
        sequenceName = "SQ_FAQ",              //=> DB  시퀀스 이름
        allocationSize = 1
)
// 동기화 설정(DB가 1개 증가하면 똑같이 JPA시퀀스도 증가)

//롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "fno", callSuper = false) //of="기본키", callSuper = false(부모필드는 제외)

public class Faq extends BaseTimeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                     generator = "SQ_FAQ_JPA")
    private Long fno;
    private String title;
    private String content;
}
