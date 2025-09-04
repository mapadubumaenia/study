package com.simplecoding.simpledms.jpa.gallerylikes.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GalleryLikesDto {

    private long id;                       //기본키
    private String email;
    private String uuid;
    private long likeCount;


}
