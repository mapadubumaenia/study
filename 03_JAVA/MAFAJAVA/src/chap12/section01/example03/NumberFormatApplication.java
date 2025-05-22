package chap12.section01.example03;
/**
 * NumberFormatApplication오류
 * => 숫자로 바꿀수 없는 글자를 바꾸다 보면 나타남
 *
 */
public class NumberFormatApplication {
public static void main(String[] args) {
	 String a="a100";
	 System.out.println(Integer.parseInt(a));
}
}
