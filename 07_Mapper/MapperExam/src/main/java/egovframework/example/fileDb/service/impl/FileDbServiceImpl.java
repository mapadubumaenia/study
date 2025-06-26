package egovframework.example.fileDb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.fileDb.service.FileDbService;

@Service
public class FileDbServiceImpl implements FileDbService{

	@Autowired
	FileDbMapper fileDbMapper;

	//전체조회
	@Override
	public List<?> selectFileDbList(Criteria criteria) {
		
		return fileDbMapper.selectFileDbList(criteria);
	}

	//페이지 총 갯수 구하기
	@Override
	public int selectFileDbListTotCnt(Criteria criteria) {
		
		return fileDbMapper.selectFileDbListTotCnt(criteria);
	}
	
	
	
	
}
