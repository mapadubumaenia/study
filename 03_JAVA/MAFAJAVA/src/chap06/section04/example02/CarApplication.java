package chap06.section04.example02;
//실행클래스 main
// 전역변수 => 사용법1) static 자료형 변수;
//          사용법2) 클래스명, 전역변수
// 참고) 전역메소드 안에서 일반 변수를 사용할 때 주의점:
public class CarApplication {
	int speed;
//일반메소드
	public void name() {
		speed=1;   //가능
	}
	
	
public static void main(String[] args) {
//	speed=1; 불가능
//        TODO: 전역메소드는 일반 변수를 바로 사용못함
//	      클래스 만들기로 사용:클래스 변수 =new 생성자함수();
	
	CarApplication car=new CarApplication();
	car.speed=2;
	
	
	
	
	
	
	
	
	
	
	
}
}
