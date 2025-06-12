package egovframework.example.controllerExam.web.quiz02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Quiz02Controller {

	@GetMapping("/qz02/quiz01.do")
	public String quiz01(Model model,
			@RequestParam(defaultValue = "")String dname
			) {
		model.addAttribute("dname",dname);
		return "qz02/quiz01";
	}
	
	
//	③ 퀴즈) 아래 요건에 따라 controller 함수 작성하고 JSP 화면에 결과 출력하세요
//	단, 쿼리스트링(query string) 방식을 이용하세요
//	매개변수 값은 정수 자료형으로 코딩하세요
	
	@GetMapping("/qz02/quiz02.do")
	public String quiz02(Model model,
			@RequestParam(defaultValue = "0") long dno
			) {
		model.addAttribute("dno",dno);
		return "qz02/quiz02";
	}
	
	
	
	
	
	
}
