package codeup.section1;

import java.util.Scanner;

/*
 * s1025
 */
public class S1025 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	int num= sc.nextInt();
	
	int a=(num/10000)*10000;
	int b=(num%10000/1000)*1000;
	int c=(num%1000/100)*100;
	int d=(num%100/10)*10;
	int e=(num%10);
	
	
	System.out.println("["+a+"]");
	System.out.println("["+b+"]");
	System.out.println("["+c+"]");
	System.out.println("["+d+"]");
	System.out.println("["+e+"]");
	
	sc.close();

	
}
}
