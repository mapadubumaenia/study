package chap08.section02.example02;

//다형성 사용법2: 함수의 매개변수로 넣기
//1)함수(부코믈래스 변수)
//2)함수 (자식객체변수)
public class DriverApplication {
	public static void drive(Vehicle vehicle) {
		vehicle.run();
	}
public static void main(String[] args) {

     Bus bus=new Bus();
     Taxi taxi=new Taxi();
     
     drive(bus);
     drive(taxi);
}
}
