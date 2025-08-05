package com.simplecoding.simpledms.gallery.service;


import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.gallery.dto.GalleryDto;
import com.simplecoding.simpledms.gallery.entity.Gallery;
import com.simplecoding.simpledms.gallery.repository.GalleryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GalleryService {


    private final GalleryRepository galleryRepository;
    private final MapStruct mapStruct;
    private final ErrorMsg errorMsg;

    //전체조회
    public Page<GalleryDto> selectGalleryList(String searchKeyword,
                                             Pageable pageable) {
        Page<Gallery> page=galleryRepository.selectGalleryList(searchKeyword, pageable);
        //TODO: .map(람다식): 스트림의 자동반복문 함수, 람다식을 배열의 개수만큼 자동 반복하는 함수
        return page.map(data->mapStruct.toDto(data));
    }

    //   DB 에 이미지 저장관리(장점: 유지보수, 편함 / 성능은 좀 낮음)
    //  =>컴퓨터 이전시 Db백업에서 옮기면 끝(편함)
    //  => DB저장안하는 방법: 성능 좋음, DB백업,다른컴퓨터도 백업 등(관리 어려움)
    //  추가: 1) DB 이미지 저장
    //       2) 이미지 다운로드 URL만들기
    //   참고) AWS에 이미지 저장(성능도 좋고 관리도 쉬움) =>돈이많이듬


    //저장
    public void save(GalleryDto galleryDto, byte[] image) {
        // 1) DTO -> entity복사
        Gallery gallery=mapStruct.toEntity(galleryDto);
        // 2) 기본키 : UUID 만들기
        String newUuid= UUID.randomUUID().toString();
        // 3) 이미지를 다운로드 하는 URL 만들기 : 기본키로(uuid) 만듬
        String downloadUrl=generateDownloadUrl(newUuid);
        // 4) setter로 위의 정보 넣기
        gallery.setUuid(newUuid);
        gallery.setGalleryFileUrl(downloadUrl);
        gallery.setGalleryData(image);
        // 5) 저장
        galleryRepository.save(gallery);
    }

    // 이미지를 다운로드하는 URL만들어주는 함수
//   URL: 웹브라우저주소창 또는 img 태그 -> 해당하는 컨트롤러 메소드가 이미지를 전송해 줌
    public String generateDownloadUrl(String uuid) {
//      인터넷주소 체계        : http://localhost:8080/경로(path)?쿼리스트링
//      기본주소(ContextPath): http://localhost:8080
//      URL 만드는 클래스      : ServletUriComponentsBuilder
        return ServletUriComponentsBuilder
                .fromCurrentContextPath()     // 기본주소 : http://localhost:8080
                .path("/gallery/download")  // 경로    : /gallery/download
                .query("uuid="+uuid)          // 쿼리스트링: ?uuid=uuid값
                .toUriString();               // 위에꺼조합:
        // http://localhost:8080/gallery/download?uuid=uuid값
    }

    //    상세조회: 기본키로 조회
    public Gallery findById(String uuid) {
        return galleryRepository.findById(uuid)
                .orElseThrow(() -> new RuntimeException(errorMsg.getMessage("errors.not.found")));
    }


    //삭제
    public void deleteById(String uuid) {
        galleryRepository.deleteById(uuid);
    }


}
