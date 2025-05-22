package chap12.section02.quiz01;
/**
 * 사용법:
 *       try{실행문;} catch{System.out.println(보여줄메시지);}
 *       =>try의 실행문 실행하다가 에러가 발생하면 catch블럭이 이동됨
 *      finally: 에러가 발생하던 안하던 항상 실행되는 블럭
 */
public class TryCatchFinallyApplication {
	public static void main(String[] args) {

		try {
			int[] a = { 1, 2 };
			System.out.println(a[5]);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("에러가 발생했습니다.관리자에게 확인하세요");
		} finally {
			System.out.println("프로그램이 종료되었습니다.");
		}
	}
}
