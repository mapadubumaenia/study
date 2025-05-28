package chap17.example01;

/**
 * 내부클래스: 중첩클래스, 전역으로(Static)만들기
 *
 */
public class S2_Outer {
//전역필드로 중첩클래스
	static class Share {
		public static void method1() {
			System.out.println("전역");
		}

		public void method2() {
			System.out.println("일반");
		}
	}
}
