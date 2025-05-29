package chap18.example03;
/**
 * 작업쓰레드1:  계산기의 함수(setMemory(50))을 실행
 * 
 *
 */
public class User1 extends Thread{
// 클래스의 3요소: 1)필드 2)생성자 3)메소드
	private Calculator calculator;

	//세터 : 필드의 값을 수정 또는 저장하는 함수
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// 쓰레드 run() 메소드 오버라이딩	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculator.setMemory(50);
	}
	
	
}
