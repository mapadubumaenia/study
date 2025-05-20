package chap01.section04;

import java.util.Scanner;

public class S4_Scanner4 {
public static void main(String[] args) {
	Scanner a= new Scanner(System.in);
	String b=a.next();
	String c=a.next();
	System.out.println(b+ " " +c);
	//""는 띄어쓰기용
	a.close();
}
}
