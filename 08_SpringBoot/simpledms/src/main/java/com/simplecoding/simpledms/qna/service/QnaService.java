package com.simplecoding.simpledms.qna.service;


import com.simplecoding.simpledms.common.MapStruct;
import com.simplecoding.simpledms.qna.dto.QnaDto;
import com.simplecoding.simpledms.qna.entity.Qna;
import com.simplecoding.simpledms.qna.repository.QnaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QnaService {
    //    생성자 DI
    private final QnaRepository qnaRepository;
    private final MapStruct mapStruct;       // 복사 라이브러리



    //    전체조회(페이징): like 검색
    public Page<QnaDto> selectQnaList(String searchKeyword,
                                       Pageable pageable) {
        Page<Qna> page=qnaRepository.selectQnaList(searchKeyword, pageable);
        return page.map(data->mapStruct.toDto(data));
    }

}
