package egovframework.example.controllerexam.web.qz05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quiz05AjaxController {
	@GetMapping(value="/qz05/ajaz01.do", produces = "application/text; charset=UTF-8;")
	public String quiz01() {
		return "안녕 Ajax";
	}
	
}
