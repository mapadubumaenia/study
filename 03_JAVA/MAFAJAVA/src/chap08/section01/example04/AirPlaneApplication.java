package chap08.section01.example04;

//실행클래스
public class AirPlaneApplication {
public static void main(String[] args) {
	
   SuperAirPlane superAirPlane= new SuperAirPlane(1);
   superAirPlane.takeOff();  //이륙
   superAirPlane.fly(); //일반비행합니다(flyMode =1),
   
   //비행모드 변경 1->2
   
   superAirPlane.flyMode=2;
   superAirPlane.fly();
   
   
	
	
}
	
}
