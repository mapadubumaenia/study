package com.simplecoding.simpledms.es.lookup.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//TODO: 엘라스틱서치 어노테이션
//TODO:@Document(indexName = "인덱스명")
@Document(indexName = "lookup-all")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LookupALL {
    @Id                    // TODO 문서Id를 지정하는 어노테이션
    private String id;     //기본키, 문서id
    private String type;   //구분 (emp,dept구분)
    private String title;  //부서명
    private String content;    //부서위치
    private String question;  //사원이름
    private String answer;    //직위



}
