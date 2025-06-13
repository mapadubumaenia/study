/**
 * 
 */
package egovframework.example.controllerexam.web.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author user
 * @RequestParam ?
 //	인터넷 통신 규약(약속): 
//	테스트 url : http://localhost:8080/ex02/example01.do?name=홍길동
 *  인터넷주소 : 프로토콜://도메인:포트번호/url경로?쿼리스트링
 *  기본 인터넷주소(프로토콜://도메인:포트번호): 돈주고 구매
 *  쿼리스트링: ?웹변수=값
 *  @RequestParam(옵션) String 매개변수: 쿼리스트링의 웹변수의 값을 가져오는 어노테이션
 */
@Controller
public class ParamController {
//	@RequestParam 사용하기
//	①예제) 아래 요건에 따라 controller 함수 작성하고 JSP 화면에 결과 출력하세요
//	단, 쿼리스트링(query string) 방식을 이용하세요
//  http://localhost:8080/ex02/example01.do?name=홍길동
	@GetMapping("/ex02/example01.do")
	public String example01(Model model,
					@RequestParam(defaultValue = "") String name
			) {
		model.addAttribute("name", name);
		return "ex02/example01";
	}
}



