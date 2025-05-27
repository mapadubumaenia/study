package chap11.finalquiz01;

public class BusApplication {
public static void main(String[] args) {
	Vehicle vehicle = new Bus();
	 vehicle.run(); // 버스가 달립니다.
	 Bus bus = (Bus)vehicle;
     System.out.println(bus);
}
}
