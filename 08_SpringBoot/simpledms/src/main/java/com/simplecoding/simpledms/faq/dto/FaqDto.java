package com.simplecoding.simpledms.faq.dto;

import lombok.*;

// TODO: 목적: 엔티티는 필드를 생략 또는 추가 불가합니다.
//        그래서, 화면에 필드를 보여주기 싫을때 또는 추가하고 싶을때
//        엔티티와 닮은 DTO을 사용해서 보여줍니다.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FaqDto {
//    엔티티의 필드를 보고 작성(VO 와 비슷하게 작성)
    private Long fno;                      // 기본키, 시퀀스
    private String title;
    private String content;
}
