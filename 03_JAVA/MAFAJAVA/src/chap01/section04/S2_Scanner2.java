package chap01.section04;

import java.util.Scanner;

public class S2_Scanner2 {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	int b= a.nextInt();//정수 1개
	//long 같은 자료형이나 실수 같은 자료형도 다 있다.
	//next이기 때문에 1개의 정수를 입력받는 기능
	System.out.println(b);
	a.close(); // 사용 후 닫아주기
}
}
