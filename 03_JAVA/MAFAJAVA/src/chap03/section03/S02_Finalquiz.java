package chap03.section03;

import java.util.Scanner;

public class S02_Finalquiz {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	if (a%3==0) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	sc.close();
}
}
