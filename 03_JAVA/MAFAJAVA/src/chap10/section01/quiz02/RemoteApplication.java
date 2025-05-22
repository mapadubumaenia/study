package chap10.section01.quiz02;

public class RemoteApplication {
	public static void main(String[] args) {
		 Remote rc = new Tv();
		 rc.turnOff(); // Tv 를 끕니다.
		 rc = new Audio();
		 rc.turnOff(); // 오디오를 끕니다.
		 }

}
