/**
 * 
 */
package egovframework.example.controllerexam.web.ex03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author user
 *  http://localhost:8080/ex03/example01.do?name=홍길동
 *  => 쿼리스트링: ?웹변수=값&웹변수2=값2&...
 */
@Controller
public class MultiParamController {
// @RequestParam 여러 개 사용하기
//	①예제) 아래 요건에 따라 controller 함수 작성하고 JSP 화면에 결과 출력하세요
//	단, 쿼리스트링(query string) 방식을 이용하세요
	@GetMapping("/ex03/example01.do")
	public String example01(Model model,
			@RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "") String id
			) {
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		return "ex03/example01";
	}
	
//	예제) 아래 요건에 따라 controller 함수 작성하고 JSP 화면에 결과 출력하세요
//	단, 쿼리스트링(query string) 방식을 이용하세요
//	단, css를 이용해서 중앙 정렬하고 margin-top을 적당히 적용하세요
	@GetMapping("/ex03/example02.do")
	public String name(Model model,
			@RequestParam(defaultValue = "") String fno,
			@RequestParam(defaultValue = "") String title,
			@RequestParam(defaultValue = "") String content
			) {
		List<String> list=new ArrayList<String>();
		list.add(fno);
		list.add(title);
		list.add(content);
		model.addAttribute("list", list);
		return "ex03/example02";
	}

//	예제) 이전 예제와 비슷하게 컨트롤러 메소드를 작성하고 배열값을 JSP 반복문을 이용해서 
//	화면에 표시하세요
//	단, 부트스트랩 테이블을 이용하세요
//	단, css를 이용해서 중앙 정렬하고 margin-top을 적당히 적용하세요
	@GetMapping("/ex03/example03.do")
	public String example03(Model model,
			@RequestParam(defaultValue = "") String fno,
			@RequestParam(defaultValue = "") String title,
			@RequestParam(defaultValue = "") String content
			) {
		List<String> list=new ArrayList<String>();
		list.add(fno);
		list.add(title);
		list.add(content);
		model.addAttribute("list", list);
		return "ex03/example03";
	}	
	
	
//	⑦ 예제) 아래 요건에 따라 controller 함수 작성하고 JSP 조건문을 이용해 화면에 표시하세요
	@GetMapping("/ex03/example04.do")
	public String example04(Model model,
			@RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "") String color
			) {
		model.addAttribute("name",name);
		model.addAttribute("color",color);
		return "ex03/example04";
	}
	
	
}









