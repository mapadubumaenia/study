package chap01.section04;

import java.util.Scanner;
//(자바 유틸)이라는 폴더에서 가져오겠다.

public class S1_Scanner {
public static void main(String[] args) {
//키보드로 입력받는 방법 알아보기	
	Scanner a =new Scanner(System.in);//객체 가져오기
//  in: 키보드를 뜻함	
//  system.out :모니터를 뜻함	
//  Scanner 객체(그룹핑): 입력에 관련된 변수,함수 묶음 관리	
//  scanner 의 문서를 닫지않으면 경고가뜸, 나중에배움	
	String b=a.next();
// 사용법: 스캐너변수.next():1 단어를(공백기준) 입력받는 함수
	System.out.println(b);
	a.close(); // 사용 후 닫아주기
}
}
