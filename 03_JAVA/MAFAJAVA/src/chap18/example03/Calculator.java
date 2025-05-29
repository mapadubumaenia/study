package chap18.example03;
/**
 * 계산기 클래스
 *
 */
public class Calculator {
// 클래스 3요소: 1)필드 2)생성자 3)메소드
//에러제거 	private int memory;
	 
	
	
//  세터 함수: 2개의 쓰레드가 동시에 실행되고 있음(문제점)
//     =>synchronized 키워드 사용 (해결!)	
	public synchronized void setMemory(int memory) {
		try {
//         1초(1000) 실행지연
			Thread.sleep(1000);
//         화면에 memory값 표기
			System.out.println(memory);
//에러제거			this.memory=memory;
		} catch (Exception e) {}
	}
}
