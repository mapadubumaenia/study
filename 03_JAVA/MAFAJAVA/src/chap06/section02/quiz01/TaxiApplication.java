package chap06.section02.quiz01;

public class TaxiApplication {
public static void main(String[] args) {
	Taxi taxi=new Taxi("기아");
	Taxi taxi2=new Taxi("현대");
	
	System.out.println(taxi.company);
	System.out.println(taxi2.company);
}
}
