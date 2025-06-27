package egovframework.example.gallery.service;

import org.springframework.web.multipart.MultipartFile;

import egovframework.example.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GalleryVO extends Criteria {

//	UUID	VARCHAR2(1000 BYTE)
//	GALLERY_TITLE	VARCHAR2(1000 BYTE)
//	GALLERY_DATA	BLOB
//	GALLERY_FILE_URL	VARCHAR2(1000 BYTE)
//	DELETE_YN	VARCHAR2(1 BYTE)
	
	
	private String uuid;                   //기본키
	private String galleryTitle;           //제목
	private byte[] galleryData;            //첨부파일
	private MultipartFile image;           //내부 목적 사용
	private String galleryFileUrl;         //이미지 다운로드를 위한 URL
	
	// 2개 세트
	public GalleryVO(String galleryTitle, byte[] galleryData) {
		super();
		this.galleryTitle = galleryTitle;
		this.galleryData = galleryData;
	}

	
	//3개 세트
	public GalleryVO(String uuid, String galleryTitle, byte[] galleryData) {
		super();
		this.uuid = uuid;
		this.galleryTitle = galleryTitle;
		this.galleryData = galleryData;
	}
	
	
	
	
	
	
	
}
