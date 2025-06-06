package chap15.section03.example10;

import java.util.Arrays;

/**
 *  스트림 메소드 MapToObj() 알아보기
 *  숫자->글자로 변경할때 사용하는 스트림 메소드
 * 스트림: 내부적으로 반복문이 실행됨(배열의 원소개수만큼)
 */
public class StreamApplication {
public static void main(String[] args) {
	int[] val= {1,2,3};
//  TODO: 숫자배열-> 글자배열로 변경
//  사용법: 숫자->글자로 변경: String.valueOf(숫자)	
	String[] str=Arrays.stream(val)   //정의부
			.mapToObj(x->String.valueOf(x)) //가공
		    .toArray(a->new String[a]);   //새배열(글자형)으로 내보내기
	Arrays.stream(str).forEach(a->System.out.println(a));
}
}
