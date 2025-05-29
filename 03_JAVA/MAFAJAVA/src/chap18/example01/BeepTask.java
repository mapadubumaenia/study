package chap18.example01;
/**
 * 쓰레드 만들기: 1)인터페이스 상속
 *
 */
import java.awt.*;

public class BeepTask implements Runnable{
	// 메소드 오버라이딩
//    Runnable 인터페이스의 run()함수 코딩: 할것을 코딩(1개의 쓰레드)	
	@Override
	public void run() {
		// TODO 쓰레드 1개: 띵소리를 내도록 하기
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		toolkit.beep();   //띵
		
	}
}
