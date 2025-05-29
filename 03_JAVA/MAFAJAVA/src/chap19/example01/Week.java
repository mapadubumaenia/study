package chap19.example01;
/**
 * 열거형:전역 상수를 묶어서 관리하는 클래스
 *  예) static final String A="월";
 *  열거형은 getter만 만들수 있다. setter없음!
 */
public enum Week {
// 열거형 클래스 4요소: 0)전역상수("값") 1)필드 2)생성자 3)메소드
    MONDAY("월요일"),SUNDAY("일요일");
	
	
//필드	
	private final String value;

	
// 생성자
    private Week(String value) {
	this.value = value;
     }

    
 // 게터 메소드  
	public String getValue() {
		return value;
	}

    

	

	
}
