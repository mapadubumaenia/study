package chap03.section02;

import java.util.Scanner;

public class S96_Mafa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= a) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		sc.close();

	}
}
