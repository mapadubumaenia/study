package chap09.quiz02;

public class PointApplication {
	public static void main(String[] args) {
		ColorPoint colorPoint = new ColorPoint();
		colorPoint.setX(3); // 부모 setter
		colorPoint.setY(4); // 부모 setter
		colorPoint.setColor("red"); // 자식 setter
		colorPoint.showColorPoint(); // 자식메소드 실행
	}

}
