package codeup.section1;

import java.util.Scanner;

public class S1033 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String hex = Integer.toHexString(a);
		System.out.printf(hex.toUpperCase());
		sc.close();
	}
}