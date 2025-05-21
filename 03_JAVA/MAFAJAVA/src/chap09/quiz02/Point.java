package chap09.quiz02;

public class Point {
	int x;
	int y;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
