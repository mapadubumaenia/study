package chap08.section03.example01;
//추상클래스 1)추상메소드를 사용하면 반드시 추상클래스를 만들어야함.

//추상메소드:  1) {}실행블럭 없는 메소드, abstract 예약어를 사용

//추상 메소드 사용목적: 1)반드시 자식클래스에서 상속받아서 오버라이딩 해야함
//    2)부모 함수는 별 필요없음, 계속 오버라이딩해서 사용할 예정
//    3)효과: 부모함수의 이름을 강제할 수 있음:표준화
//           (실무에서 개발자가 100명이라면 함수이름이 100개;;)
public abstract class Animal {

	public void breathe() {
	System.out.println("숨쉬다");
}
//추상 메소드 만들기 =>함수 메소드 앞에 abstract를 붙인다.
//              => 클래스 앞에도 abstract를 붙인다.	
	public abstract void sound();


}
