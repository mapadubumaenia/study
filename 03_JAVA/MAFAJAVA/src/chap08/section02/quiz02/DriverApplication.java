package chap08.section02.quiz02;

public class DriverApplication {
	
	public static void driver(Airplane airplane) {
		airplane.fly();
	}
	
public static void main(String[] args) {
	
	AsianaAir asianaAir=new AsianaAir();
	koreaAir koreaAir=new koreaAir();
	
	koreaAir.fly();
	asianaAir.fly();
	
	
	
}
}
