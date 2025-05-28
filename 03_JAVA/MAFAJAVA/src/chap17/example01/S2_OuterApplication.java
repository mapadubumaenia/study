package chap17.example01;
/**
 * 실행클래스
 *
 */
public class S2_OuterApplication {
public static void main(String[] args) {
	
//   static 전역 내부클래스 만들기
//   전역 내부클래스의 전역메소드는 그냥.눌러서 실행하면 됨	
	S2_Outer.Share.method1();
	
//  2) 전역내부클래스의 일반 메소드는?
//   사용법: 외부클래스.전역내부클래스 변수=new 외부클래스.내부생성자();	
	S2_Outer.Share s=new S2_Outer.Share();
	s.method2();
}
}
