package egovframework.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//첫화면 : 메인화면
	@GetMapping("/home.do")
	public String name() {
		return "home";
	}
	
}
