package com.simplecoding.simpledms.es.gallerysuggested.dto;


import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GallerySuggestedDto {


    private String email;
    private List<String> suggested;       //이미지 추천 목록(배열)
    private LocalDate insertTime;
    private LocalDate updateTime;
}
