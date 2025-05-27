package chap15.section02.example02;

import java.util.ArrayList;
import java.util.List;
/**
 * 제네릭3
 * @author user
 *
 */
public class S3_GenericApplication {
public static void main(String[] args) {
	
	List<Integer> a= new ArrayList<>();
	List<String> b= new ArrayList<>();
	
//자료형 제한없이 이 배열에 모두 넣기
// 사용법: List<?> 변수	
	List<?> list=a;
	List<?> list2=b;
	
	System.out.println(list);
	System.out.println(list2);
}
}
