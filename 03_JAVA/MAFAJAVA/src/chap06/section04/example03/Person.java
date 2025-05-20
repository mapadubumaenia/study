package chap06.section04.example03;

//상수 만들기
//변수: 1개 값을 저장하는곳, 값을 수정 할 수 있음  o
//상수: 1개 값을 저장하는곳, 값을 수정 할 수 없음  x
// (주의) 만들고 나서 바로 값을 넣어야함(아니면 에러발생)
// 2) 생성자를 만들어도 됨
public class Person {

//클래스 3요소: 1)필드 2)생성자함수 3)메소드
// 필드부터!
	final String nation = "Korea";
//상수 사용법: final 자료형 상수="값"	
	// (주의) 만들고 나서 바로 값을 넣어야함(아니면 에러발생) 추천

	// 생성자로 값넣어도 됨 (비추천)
	final String name;

	public Person(String name) {
		super();
		this.name = name;
	}

}
