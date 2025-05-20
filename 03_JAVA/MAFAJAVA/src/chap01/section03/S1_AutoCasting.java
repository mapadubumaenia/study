package chap01.section03;

public class S1_AutoCasting {
public static void main(String[] args) {
//  TODO: 정수 종류: int(보통 정수), long(큰 정수)	
	int a=1;
	long b=a;
	System.out.println(b);
// TODO:작은 정수에서 큰 정수에 넣을때는 아무 문제 없음	
	
// TODO:실수 종류:folat(보통 실수), double(더 큰 실수)	
	
	float c=1.5f;
	double d=c;
	System.out.println(d);
// TODO:작은 실수에서 큰 실수에 넣을때는 아무 문제 없음	
// TODO:캐스팅: 자료형 변환(int ->long 등등)
// TODO:작은 크기를 큰 크기에 넣으면 아무 이상이 없기에 
//	    자동으로 된다하여 AutoCasting이라고 한다.
	
	
}
}
