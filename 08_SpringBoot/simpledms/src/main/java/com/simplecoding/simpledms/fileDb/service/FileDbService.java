package com.simplecoding.simpledms.fileDb.service;


import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.fileDb.dto.FileDbDto;
import com.simplecoding.simpledms.fileDb.entity.FileDb;
import com.simplecoding.simpledms.fileDb.repository.FileDbRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileDbService {

    private final FileDbRepository fileDbRepository;
    private final MapStruct mapStruct;            // 복사 라이브러리
    private final ErrorMsg errorMsg;               //에러메시지 화면표시 클래스


    //전체조회
    public Page<FileDbDto> selectFileDbList(String searchKeyword,
                                          Pageable pageable) {
        Page<FileDb> page=fileDbRepository.selectFileDbList(searchKeyword, pageable);
        //TODO: .map(람다식): 스트림의 자동반복문 함수, 람다식을 배열의 개수만큼 자동 반복하는 함수
        return page.map(data->mapStruct.toDto(data));
    }

    //저장
   public void save(FileDbDto fileDbDto,byte[] image) {
        // 1) DTO -> entity복사
       FileDb fileDb=mapStruct.toEntity(fileDbDto);
       // 2) 기본키 : UUID 만들기
       String newUuid= UUID.randomUUID().toString();
       // 3) 이미지를 다운로드 하는 URL 만들기 : 기본키로(uuid) 만듬
       String downloadUrl=generateDownloadUrl(newUuid);
       // 4) setter로 위의 정보 넣기
       fileDb.setUuid(newUuid);
       fileDb.setFileUrl(downloadUrl);
       fileDb.setFileData(image);
       // 5) 저장
       fileDbRepository.save(fileDb);
   }

    // 이미지를 다운로드하는 URL만들어주는 함수
//   URL: 웹브라우저주소창 또는 img 태그 -> 해당하는 컨트롤러 메소드가 이미지를 전송해 줌
    public String generateDownloadUrl(String uuid) {
//      인터넷주소 체계        : http://localhost:8080/경로(path)?쿼리스트링
//      기본주소(ContextPath): http://localhost:8080
//      URL 만드는 클래스      : ServletUriComponentsBuilder
        return ServletUriComponentsBuilder
                .fromCurrentContextPath()     // 기본주소 : http://localhost:8080
                .path("/fileDb/download")  // 경로    : /fileDb/download
                .query("uuid="+uuid)          // 쿼리스트링: ?uuid=uuid값
                .toUriString();               // 위에꺼조합:
        // http://localhost:8080/fileDb/download?uuid=uuid값
    }


}
