package chap03.section03;

import java.util.Scanner;

public class S08_FinalQuiz {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sec=new Scanner(System.in);
	int a =sc.nextInt();
	String b = sec.next();
	
	for (int i = 0; i < a; i++) {
		System.out.println(b);
	}
	sc.close();
	sec.close();
}
}
