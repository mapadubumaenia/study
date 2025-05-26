
package chap15.section01.example01;

/**
 * @author user 이름 없는 자식클래스(상속): 익명 클래스, 목적) 자식클래스 만들기 싫고 간단히 그 자리에서 메소드 오버라이딩해서
 *         사용하고 싶을때 사용(1회용) 사용 위치: 1) 필드 2) 메소드 안에서 3) 메소드의 매개변수 자리
 */
public class Noname {
// 클래스의 3요소: 1)필드, 2)생성자 3)메소드
//	필드
//	익명 클래스 정의: 아래 부모클래스 Person의 wake() 메소드 오버라이딩하고 있음
//	사용법: 부모클래스 변수=new 부모생성자(){ void 메소드(){} }
//	 => 위의 부모생성자() 뒤의 {} 익명클래스가 됩니다.
	Person person = new Person() {
		@Override
		public void wake() {
			System.out.println("5시 일어남");
		}
	};

// 메소드 안에서 사용하기
	public void method1() {
		Person person2 = new Person() {
//			익명 자식클래스
			@Override
			public void wake() {
				System.out.println("12시 일어남");
			}
		};
		person2.wake();
	}
}
