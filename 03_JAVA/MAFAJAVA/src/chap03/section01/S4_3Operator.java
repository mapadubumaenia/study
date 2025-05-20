package chap03.section01;

public class S4_3Operator {
public static void main(String[] args) {
	int a=9;
	String b=(a>=9)? "출발":"대기"; 
	System.out.println(b);
// 3항연산자: 간단한 조건문일때 주로 사용,(축약식 느낌)
// 사용법:   string변수2=(변수>=값)?"값":"값2";
// 결과가 항상 변수에 저장된다.	
}
}
