package chap13.section01.example08;

public class S8_Quiz {
public static void main(String[] args) {
	String old="자바 프로그램. 자바 API";
	String newStr= old.replace("자바", "Python");
	System.out.println(old);
	System.out.println(newStr);
	
	String k="오늘 점메추 받는다";
	String n=k.replace("점메추", "저메추");
	System.out.println(n);
}
}
