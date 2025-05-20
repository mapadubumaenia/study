package chap01.section05;

public class S6_Operator {
public static void main(String[] args) {
// 2개의 글자가 일치하는지 확인하는 함수: "글자1".equals("글자2")
// ==(같다)로 하면 안됨	
	String a="Hello";
	String b="Hello";
	String c=new String("Hello");
//  new string의 경우에는 메모리에 저장하는 위치가 틀림(나중에배움)	
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
}
}
