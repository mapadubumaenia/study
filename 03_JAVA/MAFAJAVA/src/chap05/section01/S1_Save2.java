package chap05.section01;

public class S1_Save2 {
public static void main(String[] args) {
	String a="홍길동";   //추천(객체:묶음변수) 힙방에 저장
	String b= new String("홍길동");    //사용 비추천
	
	
	
//  if(a==b)를 쓰면 안된다!		
// TODO: ==(등호):1)숫자비교용, 스택방의 값을 비교하는 연산자
	if (a.equals(b)) {
		System.out.println("같음");
	}
//	  스택                   힙
//	 이름  값                방번호 값
//	 a    1                  1  홍
//	                         2  길
//	                         3  동
//	 b    4                  4  홍
//	                         5  길
//	                         6  동
//	
//  글자값은 스택방에 힙의 주소를 저장하므로 주소값으로 저장된다.	
//  ==(등호함수)는 스택방의 값을 비교하기 때문에 a와 b의 값은 다르다.
}
}
