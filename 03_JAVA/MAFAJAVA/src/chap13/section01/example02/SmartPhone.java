package chap13.section01.example02;
/**
 * 
 *
 */
public class SmartPhone {
//클래스의 3요소: 1)필드 2)생성자함수 3)메소드
	private String company;  //회사(애플 등)
	private String os;       //ios
	
	
//생성자 함수:매개변수 2개	
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}


	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
	
	
	
	
	
}
