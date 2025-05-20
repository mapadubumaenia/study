package chap01.section03;

public class S4_Conversion {
public static void main(String[] args) {
	String a="10";
	int b=Integer.parseInt(a);
//TODO:Integer.parseInt: 글자를 정수로 바꾸어 주는 기능. 	
	System.out.println(b);
	
	int c=Integer.parseInt(a,2);
	System.out.println(c);
//TODO:	Integer.parseInt(a,2) 처럼 뒤에 
//	    진수를 선택할수 있다.(2진수,10진수,16진수 가능)

}
}
