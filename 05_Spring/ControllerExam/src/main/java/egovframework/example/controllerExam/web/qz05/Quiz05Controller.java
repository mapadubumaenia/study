/**
 * 
 */
package egovframework.example.controllerexam.web.qz05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author user
 * 버튼 잇는 화면 띄우기 컨트롤러
 */
@Controller
public class Quiz05Controller {
   @GetMapping("/qz05/quiz01.do")
   public String quiz01() {
      return "qz05/quiz01";
   }
}
