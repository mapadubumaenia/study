package chap01.section04;

import java.util.Scanner;

public class S99_Agecheck {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age= a.nextInt();
		if (age>19) {
			System.out.println("빵ㅋㅋ");
		}
		if (age<=19) {
			System.out.println("농ㅋㅋ");
		}
		a.close();
	}
}
