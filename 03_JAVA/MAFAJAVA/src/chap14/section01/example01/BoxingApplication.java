package chap14.section01.example01;
/**
 * 래퍼클래스:정수,실수,참/거짓 등을 클래스로 표현한 것
 * 래퍼:랩(비닐싸는것)
 *예) 정수 : int == integer
 *         long==Long
 *         boolean==Boolean
 *         double==Double
 */
public class BoxingApplication {
public static void main(String[] args) {
	Integer obj=100;
	int value=(obj);
	System.out.println(obj);
	System.out.println(value);
}
}
