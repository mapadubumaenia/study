/**
 * 
 */
package egovframework.example.controllerexam.web.ex05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author user
 * ajax : 결과가 json 으로 내보내기 됩니다. 
 * pom.xml : (1) ajax 라이브러리 설치, 
 * (2) 추가 설정  
 * json : 자바스크립트 객체 예) {속성:값,속성2:값2...}
 * 주의점 : (1) 한글이 깨져보임
 * 추가코딩(해결책) => produces = "application/text; charset=UTF-8;"
 * @RestController: 결과를 json 으로 내보내기하는 어노테이션
 */
@RestController
public class SelectController {
   @GetMapping(value="/api/select.do", produces = "application/text; charset=UTF-8;")
   public String name() {
      return "Hello Ajax";
   }
}

