package chap17.example03;
/**
 *  내부클래스에서 외부 클래스의 전역필드 또는 메소드를 사용 가능?
 *  결론: 전역 필드/ 전역 메소드는 일반 /static 내부클레서 모두 사용가능
 */
public class S2_Outer {

//전역필드
	static int field;
	public static void method() {}
	
	
//일반 내부클래스	
	class Attr{
		
		public void name() {
			field=10;          //o
			method();          //o
		}
	}
	   
	
//전역 내부클래스	
	static class Share{
		public void name() {
			field=10;           //o
			method();           //o
		}
	}
	
	
	
	
	
	
}
