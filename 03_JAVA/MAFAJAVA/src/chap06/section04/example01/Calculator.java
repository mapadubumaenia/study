package chap06.section04.example01;
//계산기 클래스
public class Calculator {
//클래스 3요소: 1)필드 2)생성자함수 3)메소드
//필드
	//전역변수 만들기 사용법: static 자료형 변수;
	static double pi=3.14;
	//효과 : 모든 클래스가 변수를 공유할 수 있음
	
//전역 메소드 만들기 사용법:
    public static int plus(int x, int y) {
		return x+y;
	}
    
    
}
