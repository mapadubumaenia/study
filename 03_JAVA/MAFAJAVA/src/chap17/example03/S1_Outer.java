package chap17.example03;
/**
 * 내부클래스(중첩클래스): 클래스 안에 클래스
 * 위치: 1)필드 2)메소드위치
 * 내부클래스에서 외부클래스의 필드 또는 메소드를 사용 가능한가?
 * 결론: 일반 외부 클래스의 일반필드/메소드는 static 내부 클래스에서 사용 불가
 * 
 */
public class S1_Outer {
//클래스 3요소: 1)필드 2)생성자 3)메소드
//필드
	int field;
	public void method() {}
	
	
//   일반 내부 클래스 정의
	class Attr{ 
		public void method2() {
			field=3;           //o
			method();          //o
		}
	}

//   전역(static) 내부 클래스 정의
	 static class Share{
//		 field=45;           //x
//		 method();            //x
	 }
	
	
	
	
	
	
	
	
	
	
	
	
}
