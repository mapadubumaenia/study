package chap12.section02.example04;

/**
 * throws: 이 함수에서는 예외처리 하지않고 나를 호출하는 쪽에서 예외처리를 하세요.(예외처리 떠넘기기 키워드)
 *
 */
public class ThrowsApplication {

	public static void findClass() throws Exception {
		// String data = null; // 아무것도 없는 값
		// System.out.println(data.toUpperCase()); // 에러(예외) 발생
	}

	public static void main(String[] args) {

		try {
			findClass();
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("에러가 발생했습니다.관리자에게 확인하세요");
		}

	}
}
