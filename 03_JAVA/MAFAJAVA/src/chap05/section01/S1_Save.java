package chap05.section01;

public class S1_Save {
public static void main(String[] args) {
//객체(묶음변수)가 저장되는 곳 :힙방(힙 메모리):매우 넓은방(스위트룸)
//예) 글자(string):크기가 안정해져 있음(무한대) 넓은 방에 둔다.
//   배열변수: 여러가지 값을 저장하는 변수:1,2.....	
	

// 일반변수가 저장되는 곳: 스택방(스택 메모리): 좁은 방(크기가 정해짐)
//예) 정수(8byte), 실수(8byte)는 크기가 정해져있기에 좁은방에 둠
	
//예)코딩하면 실제 값은 어떻게 저장되는가?
// =>실제 코딩:   
//	    int a=3;	
//	    double b=1.2;
//	    String c="홍길동";
	
// =>스택방:             힙방:
//	이름 값              방번호 값
//	a   3              1 홍
//	b   1.2            2 길
//	c   1(방번호)        3 동
	
// (스택방에는 많은 데이터를 저장할수 없기에 힙방의 방번호를 저장해둔다)
	    
	    
//	
}
}