package chap06.section03.example04;
//메소드 오버로딩(함수이름 동일하게 사용하기: 조건에 따라)
public class Car {
	
//1)함수 사용법1: void함수명(매개변수){}
	void myPrint(String brand) {
//		기능 코딩
		System.out.println(brand);
	}
	
	
//2)함수 사용법2	
	void myPrint(int speed) {
//		기능 코딩
		System.out.println(speed);
	}
	
	
//  3)
	void myPrint(String brand,int speed) {
		System.out.println(brand+","+speed);
	}
}
