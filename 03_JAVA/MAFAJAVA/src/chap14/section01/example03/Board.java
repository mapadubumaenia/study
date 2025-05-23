package chap14.section01.example03;
/**
 * Array클래스 넣기 
 *
 */
public class Board {

	String subject;
	String content;
	public Board(String subject, String content) {
		super();
		this.subject = subject;
		this.content = content;
	}
	//toString 메소드 오버라이딩
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + "]";
	}
	
	
	
	
}
