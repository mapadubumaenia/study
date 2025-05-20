package chap05.section02;

public class S1_For2 {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5};
	
	for (int i : a) {
		System.out.println(i);
	}
//i는 배열의 값, 배열의 갯수만큼 끝까지 반복하는 함수	
//TODO: 사용법) for(int 변수:배열) System.out.println(변수);
// 변수: 배열의 값이 차례대로 저장됨
// 반복: 자동으로 배열의 끝까지 반복함	
}
}
