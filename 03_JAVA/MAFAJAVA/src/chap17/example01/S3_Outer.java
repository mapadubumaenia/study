package chap17.example01;
/**
 * 내부클래스3: 메소드안에 클래스 만들기
 *
 */
public class S3_Outer {

// 메소드:중첩클래스 만들기
	public void method() {
		class Local{
			//클래스3요소: 1필드, 2생성자, 3메소드
			public Local() {
				System.out.println("내부");   //내부생성자
			}
			public void func() {}            //메소드
		}
	
	Local local=new Local();
	local.func();       //메소드 실행
	
	}
}
