
package egovframework.example.dept.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author user
 * 복습: 인터페이스 : 추상메소드(실행블럭이 없음 {})
 * mvc코딩법: 1)서비스(인터페이스) -> 자식서비스 ->컨트롤러 -> jsp
 * 컨트롤러 역할: url경로와 jsp연결하는 곳
 * 서비스 역할: 업무로직(비즈니스 로직)을 코딩하는 곳(조회/수정/삭제/추가)
 *   
 */
public interface DeptService {
   List<?> selectDeptList(Criteria criteria); // 전체조회
   void insert(DeptVO deptVO);                // 추가
   DeptVO selectDept (long dno);              // 상세조회  (수정페이지 열기할때 사용)
   void update(DeptVO deptVO);                // 수정
   
   
}