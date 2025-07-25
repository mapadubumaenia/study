package com.simplecoding.jpaexam.faq.service;


import com.simplecoding.jpaexam.faq.entity.Faq;
import com.simplecoding.jpaexam.faq.repository.FaqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FaqService {


    private final FaqRepository faqRepository;


    //TODO: 상세조회
    public Faq findById(Long fno) {
        Faq faq = faqRepository.findById(fno).get();
        return faq;
    }


}
