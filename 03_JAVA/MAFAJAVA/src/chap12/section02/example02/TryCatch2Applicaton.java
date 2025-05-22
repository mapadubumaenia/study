package chap12.section02.example02;

/**
 * Try/Catch, try/Catch 예제
 *
 */
public class TryCatch2Applicaton {
	public static void main(String[] args) {

		try {
	//		String data = null;
	//		System.out.println(data.toUpperCase());
		} catch (Exception e) {
			System.out.println("관리자에게 문의하세요,[null에러]");
		}

		try {
			int[] a = { 1, 2 };
			System.out.println(a[5]);
		} catch (Exception e) {
			System.out.println("관리자에게 문의하세요,[배열 에러]");
		}

	}
}
