package codeup.section1;

import java.util.Scanner;

/**
 *  s1024번 문제
 *
 */
public class S1024 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String a=sc.next();
	
	String [] b= a.split("");

	
	for (int i = 0; i < b.length; i++) {
		System.out.println("'"+b[i]+"'");
	}
	sc.close();
	

}
}
