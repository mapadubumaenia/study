package chap06.section01.example01;
//실행클래스: 실행(main() 함수 포함된 클래스)
public class CarApplication {
public static void main(String[] args) {
	Car car = new Car();
	
	//객체를 만들어서 사용할때 쓰는것
//	1)Car 변수: Car 객체 이름 정하기
//	2) new    : 힙방에 방예약
//	3)Car()   : 실질적으로 힙방에 값을 넣어주는 함수 (생성자 함수)
//	
//	TODO: (1) 사용법: Car병수 = new Car();
//	      (2) 사용법: 변수.필드
	
	
	
	System.out.println(car.company);
	System.out.println(car.maxSpeed);  //30->60(공장 요청사항)
	car.maxSpeed=60;
	System.out.println(car.maxSpeed);


// 절차지향 코딩을 할 경우 변수량이 너무 많이 늘기때문에
// company 113... 같이 많아진다. 그러므로 같은 객체를 그룹핑
//	하여 프로그래밍한다.
}
}