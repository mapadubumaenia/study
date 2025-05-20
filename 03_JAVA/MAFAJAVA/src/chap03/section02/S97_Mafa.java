package chap03.section02;

import java.util.Scanner;

public class S97_Mafa {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("숫자를 입력하세요.");
	int a=sc.nextInt();
	int sum=0;
	for (int i = 1; i <= a; i++) {
		sum=sum+i;
	}System.out.println(sum);
	sc.close();
}
}
