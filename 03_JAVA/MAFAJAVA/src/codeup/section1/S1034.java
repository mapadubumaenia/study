package codeup.section1;

import java.util.Scanner;

public class S1034 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String octalInput = sc.next();
	int a = Integer.parseInt(octalInput, 8);
	System.out.println(a);
	sc.close();
}
}
