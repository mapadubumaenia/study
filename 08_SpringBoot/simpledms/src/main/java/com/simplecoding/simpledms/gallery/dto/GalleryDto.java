package com.simplecoding.simpledms.gallery.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GalleryDto {


    private String uuid;
    private String galleryTitle;
    private String galleryFileUrl;


    //TODO:생성자 (매개변수 1개:galleryTitle)
    public GalleryDto(String galleryTitle) {
        this.galleryTitle = galleryTitle;
    }
}
