package chap01.section05;

//증감연산자: 변수++(1증가), 변수--(1감소)
// 앞뒤 상관없음
public class S1_Operator {
public static void main(String[] args) {
	int x=10;
	int y=10;
	
	
	
	//(참고) 여기에서는 x는 10이다. 
	System.out.println(x);
	
	
	
	
	
	x++;  //여기를 거쳐야만 1이 증가.
	System.out.println(x);// 11
	++x;
	System.out.println(x); //12
	y--;
	System.out.println(y);// 9
	--y;
	System.out.println(y);// 8
}
}
