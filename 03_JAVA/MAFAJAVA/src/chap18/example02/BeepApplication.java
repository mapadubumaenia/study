package chap18.example02;
/**
 * 실행클래스 main()함수도 쓰레드임 
 * 이게더 쉽고 간단함. 할거면 이걸 추천
 */
public class BeepApplication {
public static void main(String[] args) {
//    클래스 변수=new 자식생성자();       //다형성!	
	Thread thread=new BeepThread();
	thread.start();                 //쓰레드 실행(오디오띵)
	
//   화면에 띵 표시
	System.out.println("띵");
}
}
