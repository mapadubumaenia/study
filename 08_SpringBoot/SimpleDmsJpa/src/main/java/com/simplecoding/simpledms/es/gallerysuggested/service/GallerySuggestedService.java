package com.simplecoding.simpledms.es.gallerysuggested.service;


import com.simplecoding.simpledms.common.ErrorMsg;
import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.common.SecurityUtil;
import com.simplecoding.simpledms.es.gallerysuggested.dto.GallerySuggestedDto;

import com.simplecoding.simpledms.es.gallerysuggested.entity.GallerySuggested;
import com.simplecoding.simpledms.es.gallerysuggested.repository.GallerySuggestedRepository;
import com.simplecoding.simpledms.jpa.auth.dto.SecurityUser2Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GallerySuggestedService {

    private final GallerySuggestedRepository gallerySuggestedRepository;
    private final MapStruct mapStruct;
    private final ErrorMsg errorMsg;
    private final SecurityUtil securityUtil;

    // TODO:상세조회: 필요(로그인 id(이메일): 1)  jsp 이메일 넘기기
    //                                     2) 백엔드 시큐리티 클래스 안에서 이메일 꺼내기(추천)
    public GallerySuggestedDto findById() {
        // TODO: 1) 시큐리티 공통 클래스에서 유저 꺼내기
        SecurityUser2Dto securityUser2Dto=securityUtil.getLoginUser();

        // TODO: 2)유저 이메일로 상세조회: 엔티티 -> DTO 변경
        GallerySuggested gallerySuggested=gallerySuggestedRepository.findById(securityUser2Dto.getUsername())
                .orElseThrow(()->new RuntimeException(errorMsg.getMessage("errors.es.not.found")));
        return mapStruct.toDto(gallerySuggested);

    }




}
