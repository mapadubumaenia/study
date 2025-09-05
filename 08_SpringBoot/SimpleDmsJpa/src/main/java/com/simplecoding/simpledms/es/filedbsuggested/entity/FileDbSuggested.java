package com.simplecoding.simpledms.es.filedbsuggested.entity;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDate;
import java.util.List;

// 엘라스틱서치 어노테이션
@Document(indexName = "filedb-likes-suggested")
//롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "email")
public class FileDbSuggested {


    @Id
    private String email;
    private List<String> suggested;       //이미지 추천 목록(배열)
    private LocalDate insertTime;
    private LocalDate updateTime;






}
