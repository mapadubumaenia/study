package chap18.example02;

import java.awt.Toolkit;

/**
 * 쓰레드 만들기2: 1)클래스를 상속해서
 *
 */
public class BeepThread extends Thread {
    //메소드 오버라이딩
	@Override
	public void run() {
		// TODO 여기에 쓰레드 일시킬것 코딩:오디오 띵소리
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		toolkit.beep();     //오디오 띵
	}

}
