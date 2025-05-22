package chap13.section01.example10;

import java.util.Arrays;

public class S10_Split {
public static void main(String[] args) {
	String a="960516-1117416";
	String[] b=a.split("-");
	System.out.println(b[0]);
	System.out.println(b[1]);
	
//하나의 문장을 기준점을 기준으로 나누는 함수
// 배열로 빼내기 때문에 배열대괄호를 써야한다.
	System.out.println(Arrays.toString(b));
	
	String shin="shin cheonseop";
	String[] nom=shin.split(" ");
	System.out.println(nom[0]);
	System.out.println(nom[1]);
	
	System.out.println(Arrays.toString(nom));
}
}
