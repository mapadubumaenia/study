package egovframework.example.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.emp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	
	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<?> selectEmpList(Criteria criteria) {
		// TODO Auto-generated method stub
		return empMapper.selectEmpList(criteria);
	}
	
	
	
	
	
}
