package chap01.section04;

import java.util.Scanner;

public class S5_Scanner {
//1 문장 입력받기:마지막에 enter키 치면 1문장
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String b=a.nextLine(); //1문장
		System.out.println(b);
		a.close();
	}
}
