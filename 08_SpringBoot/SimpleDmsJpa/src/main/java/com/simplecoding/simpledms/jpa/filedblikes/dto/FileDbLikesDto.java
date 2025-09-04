package com.simplecoding.simpledms.jpa.filedblikes.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FileDbLikesDto {
    //  엔티티 보고 작성
    private long id;                       //기본키
    private String email;
    private String uuid;
    private long likeCount;                // 좋아요 수 1번만 클릭가능
}
