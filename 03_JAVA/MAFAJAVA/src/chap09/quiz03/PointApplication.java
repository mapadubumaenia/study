package chap09.quiz03;

public class PointApplication {
	public static void main(String[] args) {

		Point point = new Point();
		System.out.println("(" + point.x + ", " + point.y + ")"); // (0,0) 출력
		Point point2 = new Point(10, 20);
		System.out.println("(" + point2.x + ", " + point2.y + ")"); // (10,20) 출력

	}
}
