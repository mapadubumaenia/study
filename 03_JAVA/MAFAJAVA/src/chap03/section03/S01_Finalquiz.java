package chap03.section03;

import java.util.Scanner;

public class S01_Finalquiz {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	if (a%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	sc.close();
}
}
