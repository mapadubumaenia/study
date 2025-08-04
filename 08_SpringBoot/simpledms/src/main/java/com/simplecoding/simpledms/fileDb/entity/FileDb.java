package com.simplecoding.simpledms.fileDb.entity;

import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "TB_FILE_DB")


// 롬북 어노테이션
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "uuid", callSuper = false) // of="기본키", callSuper = false(부모필드는 제외)
public class FileDb extends BaseTimeEntity {


    @Id
    private String uuid;         //기본키 , 자바UUID 이용
    private String fileTitle;
    private String fileContent;
    @Lob
    private byte[] fileData;          //업로드 이미지(DB 저장, BLOB자료형)
    private String fileUrl;        // 이미지 다운로드 URL(img 태그에 사용)








}
