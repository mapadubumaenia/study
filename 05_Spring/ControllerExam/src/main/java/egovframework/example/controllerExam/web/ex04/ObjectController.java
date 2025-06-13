package egovframework.example.controllerexam.web.ex04;
/*
 * 
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjectController {

//	① 예제) 아래 요건에 따라 controller 함수 작성하고 객체를 전달해서 JSP 화면에 결과 출력
//	하세요
//	단, MemberVO 는 미리 소소가 제공되었다고 가정합니다.
	@GetMapping ("/ex04/example01.do")
	public String example01() {
		return "ex04/example01";
	}
}
