package com.simplecoding.simpledms.fileDb.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FileDbDto {

    //DTO 의 필드가 화면에 보임: 결정) 성능) 이미지는 빼는게 좋음
    //          왜? => 화면에 필요한것은 다운로드 URL만 있으면 이미지 나옴 =>file data 생략

    private String uuid;         //기본키 , 자바UUID 이용
    private String fileTitle;
    private String fileContent;
    private String fileUrl;        // 이미지 다운로드 URL(img 태그에 사용)=> 화면에 이미지 보이기



    //TODO: 생성자(매개변수 2개: fileTitle, fileContent)
    public FileDbDto(String fileTitle, String fileContent) {
        this.fileTitle = fileTitle;
        this.fileContent = fileContent;
    }
}
