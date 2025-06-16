package egovframework.example.controllerexam.web.ex05;
/*컨트롤러: url경로와 jsp를 연결하는 역할을 합니다.
 * @controller:컨트롤러 기능을 부여하는 어노테이션
 * 스프링의 기본인터넷주소: http://localhost:8080
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ButtonController {
	@GetMapping ("/ex05/example01.do")
       public String example01() {
		return "ex05/example01";
	}
}
