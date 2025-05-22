package chap12.section02.example03;

/**
 * try/catch{실핼문1} /catch{실행문2} => 에러가 발생하면 실행문1이 실행되고 바로 종료합니다. =>2게증에 1개가
 * 실행됩니다.
 *
 */
public class CatchByCatchApplication {
	public static void main(String[] args) {

		try {
			// String data = null;
			// System.out.println(data.toUpperCase());// null에러
			int[] a = { 1, 2 };
			System.out.println(a[5]);// 배열에러
		} catch (NullPointerException e) {
			System.out.println("null 에러가 발생했습니다.");
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}
}
