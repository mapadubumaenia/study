package com.simplecoding.simpledms.gallery.entity;

import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "TB_GALLERY")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "uuid", callSuper = false) // of="기본키", callSuper = false(부모필드는 제외)
public class Gallery extends BaseTimeEntity {




    @Id
    private String uuid;
    private String galleryTitle;
    @Lob
    private byte[] galleryData;
    private String galleryFileUrl;

}
