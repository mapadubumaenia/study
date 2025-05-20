package chap03.section03;

import java.util.Scanner;

public class S05_FinalQuiz {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if (a==1) {
		System.out.println(1);
	}
	else if (a==2) {
		System.out.println(2);
	}
	else  {
		System.out.println(3);
	}
	sc.close();
}
}
