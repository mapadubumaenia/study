package egovframework.example.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
//Mapper 가져오기
	@Autowired
	private DeptMapper deptMapper;

	
	//전체조회
	@Override
	public List<?> selectDeptList(Criteria criteria) {
		// TODO Auto-generated method stub
		return deptMapper.selectDeptList(criteria);
	}
	
	
	
	
}
