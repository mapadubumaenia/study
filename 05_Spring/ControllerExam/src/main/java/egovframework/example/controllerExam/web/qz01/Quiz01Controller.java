/**
 * 
 */
package egovframework.example.controllerexam.web.qz01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author user
 * 
 */
@Controller
public class Quiz01Controller {
//	TODO: 퀴즈1: Hello JSP & Spring 을 화면에 표시
	@GetMapping("/qz01/quiz01.do")
	public String quiz01() {
		return "qz01/quiz01";
	}
	
//	TODO: 퀴즈2)  안녕 페이지를 화면에 표시하세요.
//	아래 그림처럼 컨트롤러와 JSP를 코딩하세요
//	단, @GetMapping, Model 을 사용하세요
	@GetMapping("/qz01/quiz02.do")
	public String quiz02(Model model) {
		model.addAttribute("quiz","안녕 페이지");
		return "qz01/quiz02";
	}
	
//	 TODO: 퀴즈3)  아래 그림처럼 컨트롤러와 JSP를 코딩하세요
//	단, @GetMapping, Model 은  3개 사용하세요
	@GetMapping("/qz01/quiz03.do")
	public String quiz03(Model model) {
		model.addAttribute("quiz","안녕 페이지");
		model.addAttribute("quiz2","안녕 페이지2");
		model.addAttribute("quiz3","안녕 페이지3");
		return "qz01/quiz03";
	}
	
//	TODO: 퀴즈4)  아래 그림처럼 컨트롤러와 JSP를 코딩하세요
//	단, @GetMapping, Model 은  3개 사용하고 키는 자유롭게 코딩하세요
//	단, 변수를 이용해서 Model 값을 넣고 사용하세요
	@GetMapping("/qz01/quiz04.do")
	public String quiz04(Model model) {
		String str="hello";
		long num=10;
		double value=10.5;
		
		model.addAttribute("str", str);
		model.addAttribute("num", num);
		model.addAttribute("value", value);
		
		return "qz01/quiz04";
	}
	
}



