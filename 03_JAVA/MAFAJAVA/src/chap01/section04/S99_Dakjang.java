package chap01.section04;

import java.util.Scanner;

public class S99_Dakjang {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("나이를 입력하세요.");
	int age=sc.nextInt();
	
	if (age>19) {
		System.out.println("닭장이자나.....");
	}
	else if (age > 12 && age <= 19) {
	    System.out.println("빵ㅋㅋ");
	}
	else{
		System.out.println("농 ㅋㅋㅋㅋㅋㅋㅋ");
	}
	sc.close();
}

}
