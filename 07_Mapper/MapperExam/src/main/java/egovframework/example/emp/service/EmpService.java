package egovframework.example.emp.service;

import java.util.List;

import egovframework.example.common.Criteria;



public interface EmpService {
	public List<?> selectEmpList(Criteria criteria);  //전체 조회
}
