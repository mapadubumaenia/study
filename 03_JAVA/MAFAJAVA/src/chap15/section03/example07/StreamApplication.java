package chap15.section03.example07;

import java.util.Arrays;

/**
 * int[], String[] 여기서 스트림 사용하기
 */


public class StreamApplication {
public static void main(String[] args) {
	String[]a= {"a","a","B"};
// 1)Arrays.stream(배열변수).foreach(람다식);
	Arrays.stream(a).forEach(s->System.out.println(s));
	
// 참고) 이것도 가능
	Arrays.stream(a).forEach(System.out::println);
	
}
}
