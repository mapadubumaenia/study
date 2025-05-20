package chap01.section01;

public class s7_Swap {
public static void main(String[] args) {
	int a= 3;
	int b= 2;
	int t=a;
	// a의 값에 b를 넣으면 2가되버리고 그 다음 b의 값에 a를 넣으려해도 
	// a는 2가 되어버렸으므로 스왑이 안됨, 그러므로 임시변수t를 a로 저장
	//하여 스왑
	a=b;
	b=t;
	System.out.println(a);
	System.out.println(b);
}
}
