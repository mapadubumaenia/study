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


}
