package chap03.section03;

import java.util.Scanner;

public class S03_Finalquiz {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a =sc.next();
	if (a.equals("Hello")) {
		System.out.println("World");
	}
	else {
		System.out.println();
	}
	sc.close();
}
}
