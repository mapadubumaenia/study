package chap17.example01;
/**
 * 내부클래스 소개:중첩클래스, 클래스안에 클래스가 있다!
 *
 */
public class S1_Outer {
//클래스의 3요소: 1)필드  2)생성자  3)메소드
// 필드
	public class Attr{
		//클래스의 3요소: 1)필드  2)생성자  3)메소드
		
		int field;                       //필드

		public Attr() {
		System.out.println("내부클래스");   //생성자      
		}
		public void method1() {}         //메소드
	}
}
