package egovframework.example.dept.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class DeptController {
//서비스 클래스 필요: 전체조회 메소드 있음
	@Autowired
	private DeptService deptService;
	
	
	//전체조회
	@GetMapping("/dept/dept.do")
	public String name(Model model, @ModelAttribute("serchVO") Criteria criteria) {
		// 서비스 클래스의 전체조회 실행 => 결과:배열()
		log.info(criteria);  //디버깅 찾기용
		List<?> list= deptService.selectDeptList(criteria);
		log.info(list);
		model.addAttribute("list",list);
		return "dept/dept_all";
	}
	
	//추가 페이지 열기
	@GetMapping("/dept/addition.do")
	public String addDeptView() {
		return "dept/add_dept";
	}
	
}
