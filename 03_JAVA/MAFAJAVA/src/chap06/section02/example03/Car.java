package chap06.section02.example03;

public class Car {
	   String company;
	   int speed;
	   
	public Car() {
		super(); 
	}//매개변수없음

	public Car(String company) {
		super();
		this.company = company;
	}//company 매개변수

	public Car(int speed) {
		super();
		this.speed = speed;//speed 매개변수
	}

	public Car(String company, int speed) {
		super();
		this.company = company;
		this.speed = speed;
	}//company,speed 매개변수
	   

}
