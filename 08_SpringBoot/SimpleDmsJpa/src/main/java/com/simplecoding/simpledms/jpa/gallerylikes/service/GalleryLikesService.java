package com.simplecoding.simpledms.jpa.gallerylikes.service;


import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.jpa.gallerylikes.dto.GalleryLikesDto;
import com.simplecoding.simpledms.jpa.gallerylikes.entity.GalleryLikes;
import com.simplecoding.simpledms.jpa.gallerylikes.repository.GalleryLikesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class GalleryLikesService {
    private final GalleryLikesRepository galleryLikesRepository;
    private final MapStruct mapStruct;
    private final ErrorMsg errorMsg;

    //   저장: 좋아요
    public void save(GalleryLikesDto galleryLikesDto) {
        if (galleryLikesRepository.countByEmailAndUuid(galleryLikesDto.getEmail(), galleryLikesDto.getUuid()) > 0) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, errorMsg.getMessage("error.likes"));
        }

        //TODO 2) db 저장
        GalleryLikes galleryLikes=mapStruct.toEntity(galleryLikesDto);
        galleryLikesRepository.save(galleryLikes);




    }




}
