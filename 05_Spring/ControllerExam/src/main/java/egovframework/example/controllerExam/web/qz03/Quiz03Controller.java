/**
 * 
 */
package egovframework.example.controllerexam.web.qz03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author user
 * 인터넷주소체계: http://localhost:8080/qz03/quiz01.do?dno=10
 * =>        프로토콜://도메인:포트번호/url경로?쿼리스트링
 * => @GetMapping : url 경로 지정 어노테이션
 * => @RequestParam:  쿼리스트링의 값을 가져오는 어노테이션
 */
@Controller
public class Quiz03Controller {
// 퀴즈) 아래 요건에 따라 controller 함수 작성하고 JSP 화면에 결과 출력하세요
//	단, 쿼리스트링(query string) 방식을 이용하세요
//	테스트 url: http://localhost:8080/qz03/quiz01.do?dno=10&dname=Accounting&loc=NewYork
	@GetMapping("/qz03/quiz01.do")
	public String quiz01(Model model,
			@RequestParam(defaultValue = "") String dno,
			@RequestParam(defaultValue = "") String dname,
			@RequestParam(defaultValue = "") String loc
			) {
		model.addAttribute("dno", dno);
		model.addAttribute("dname", dname);
		model.addAttribute("loc", loc);
		return "qz03/quiz01";
	}
	
//	퀴즈) 아래 요건에 따라 controller 함수 작성하고 JSP 화면에 결과 출력하세요
//	단, 쿼리스트링(query string) 방식을 이용하세요
//	단, css를 이용해서 중앙 정렬하고 margin-top을 적당히 적용하세요
	@GetMapping("/qz03/quiz02.do")
	public String name(Model model,
			 @RequestParam(defaultValue = "") String eno ,
			 @RequestParam(defaultValue = "") String ename,
			  @RequestParam(defaultValue = "") String job,
			  @RequestParam(defaultValue = "") String hiredate) {
		List<String> list=new ArrayList<String>();
		list.add(eno);
		list.add(ename);
		list.add(job);
		list.add(hiredate);
		
		model.addAttribute("list", list);
		return "qz03/quiz02";
	}
	
//	퀴즈) 이전 퀴즈와 비슷하게 컨트롤러 메소드를 작성하고 배열값을 JSP 반복문을 이용해서 
//	화면에 표시하세요
//	단, 부트스트랩 테이블을 이용하세요
	@GetMapping("/qz03/quiz03.do")
	public String quiz03(Model model,
			 @RequestParam(defaultValue = "") String eno ,
			 @RequestParam(defaultValue = "") String ename,
			  @RequestParam(defaultValue = "") String job,
			  @RequestParam(defaultValue = "") String hiredate) {
		List<String> list=new ArrayList<String>();
		list.add(eno);
		list.add(ename);
		list.add(job);
		list.add(hiredate);
		
		model.addAttribute("list", list);
		return "qz03/quiz03";
	}	
	
}
