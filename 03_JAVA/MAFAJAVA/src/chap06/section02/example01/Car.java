package chap06.section02.example01;

//클래스 3요소: 1)필드  2)생성자함수
public class Car {
// 필드	
	String color;  //현재 아무것도 안들어있음(null) 
	
//생성자함수:객체를 힙방에 직접 만들어주는 함수
//생성자함수1: 이클립스가 만들어줌/우클릭=>source=>generate Constructor using field
//TODO: 만약 생성자 함수를 1개도 안만들면 컴퓨터가 만들어줌
	public Car() {
		super(); //상속기능이 있어야 의미있음 지금은 효과x
	}

//생성자함수2:이클립스가 만들어줌
//   Car("검정")	=>color="검정"  
	
//Car(String color); => car("검정")	
	public Car(String color) {
		super(); //상속기능이 있어야 의미있음 지금은 효과x
		this.color = color;
		
		//TODO this: 자기자신을 의미하는 예약어
	}

}
