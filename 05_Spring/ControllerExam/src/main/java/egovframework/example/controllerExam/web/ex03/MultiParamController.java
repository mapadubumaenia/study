package egovframework.example.controllerExam.web.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 */
@Controller


public class MultiParamController {
// * £ @RequestParam 여러 개 사용하기
//	① 예제) 아래 요건에 따라 controller 함수 작성하고 JSP 화면에 결과 출력하세요
//	단, 쿼리스트링(query string) 방식을 이용하세요
	
	@GetMapping("/ex03/example01.do")
	public String example01(Model model,
			@RequestParam(defaultValue = "")String name,
			@RequestParam(defaultValue = "")String id
			) {
		model.addAttribute("name",name);
		model.addAttribute("id",id);
		return "ex03/example01";
	}
}
