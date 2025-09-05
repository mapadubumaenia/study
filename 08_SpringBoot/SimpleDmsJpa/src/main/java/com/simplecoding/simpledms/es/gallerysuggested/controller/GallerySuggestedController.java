package com.simplecoding.simpledms.es.gallerysuggested.controller;

import com.simplecoding.simpledms.es.gallerysuggested.dto.GallerySuggestedDto;
import com.simplecoding.simpledms.es.gallerysuggested.service.GallerySuggestedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GallerySuggestedController {

    private final GallerySuggestedService gallerySuggestedService;


}
