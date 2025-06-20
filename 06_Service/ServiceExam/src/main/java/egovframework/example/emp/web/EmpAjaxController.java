/**
 * 
 */
package egovframework.example.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.common.Criteria;
import egovframework.example.emp.service.EmpService;
import lombok.extern.log4j.Log4j2;

/**
 * @author user
 * 자동완성을(Auto Complete) 위한 AJAX 컨트롤러
 * @RestController : JSON(js 클래스(객체)) 데이터를 전송(return)
 *      예) JSON 예: [{dname:"SALES",loc:"서울"},{},...]
 */
@Log4j2
@RestController
public class EmpAjaxController {
//   서비스의 전체조회를 사용하기 위해 클래스 가져오기
   @Autowired
   private EmpService empService;
   
   
//   자동완성
   @GetMapping("/api/emp/emp.do")
   public  List<?> selectempList(@ModelAttribute Criteria criteria) {
//      1) criteria 클래스안에 : 검색어 있는지 확인
      log.info("ajax: "+criteria);
//      2) 전체조회(검색어포함) 실행: 결과(배열)
      List<?> list=empService.seleLictEmpList(criteria);
      return list;
   }
}






