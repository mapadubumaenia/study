package com.simplecoding.simpledms.jpa.filedblikes.service;



import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.jpa.filedblikes.dto.FileDbLikesDto;
import com.simplecoding.simpledms.jpa.filedblikes.entity.FileDbLikes;
import com.simplecoding.simpledms.jpa.filedblikes.repository.FileDbLikesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class FileDbLikesService {
    //  DI : 3가지: 1생성자 DI (추천)  2)AUTOWIRED   3)setter DI(비추천)
    private final FileDbLikesRepository fileDbLikesRepository;
    private final MapStruct mapStruct;
    private final ErrorMsg errorMsg;


    //   저장: 좋아요
    public void save(FileDbLikesDto fileDbLikesDto) {
        //TODO 좋아요 했는지 확인-> 했으면 에러처리(저장안함)
        if(fileDbLikesRepository.countByEmailAndUuid(fileDbLikesDto.getEmail(), fileDbLikesDto.getUuid()) > 0){
            throw new ResponseStatusException(HttpStatus.CONFLICT, errorMsg.getMessage("errors.likes"));
        }

        //TODO 2) db 저장
        FileDbLikes fileDbLikes =mapStruct.toEntity(fileDbLikesDto);
        fileDbLikesRepository.save(fileDbLikes);
    }




}
