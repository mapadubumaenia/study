package chap03.section01;

import java.util.Scanner;

public class S99_Mafa {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자를 입력하세요.");
	
	int number=sc.nextInt();
	if (number%2==0) {
		System.out.println("짝수입니다.");
	}
	else {
		System.out.println("홀수입니다.");
	}
	sc.close();
}
}
