package chap06.section03.quiz03;

public class TaxiApplication {
     public static void main(String[] args) {
		Taxi taxi=new Taxi();
		
		taxi.setMaxSpeed(20);
		System.out.println(taxi.getMaxSpeed());
	}
}
