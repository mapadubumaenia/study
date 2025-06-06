package chap15.section01.example03;

/**
 * 메소드 안에서 익명 클래스를 사용했을 떄 주의점; 익명클래스를 사용할때 지역변수는 자동으로 상수가 됩니다. 상수: 못고치는 값, final
 * 이름
 */
public class Noname {
//메소드
	public void method(int arg) { // (매개변수)
		int var = 10; // 지역변수(매소드 안의 변수)

// 익명클래스, computer 인터페이스
//		1)인터페이스 변수 =new 자식생성자()   기본
//		1)인터페이스 변수 =new 인터페이스()   익명클래스일때

		Computer computer = new Computer() {

			@Override
			public int sum() {
//	var=20; // 에러발생 익명클래스를 사용할때 지역변수는 자동으로 상수가 됩니다.
				return arg + var;
			}
		};
		computer.sum(); // 에러 없애기 위한 조치(수업에 없음)
	}
}
