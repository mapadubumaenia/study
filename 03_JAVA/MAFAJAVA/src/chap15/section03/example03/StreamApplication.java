package chap15.section03.example03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 스트림3: distinct(): 중복제거 함수
 *
 */
public class StreamApplication {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
    list.add("a");
    list.add("a");
    list.add("B");
    
 //  TODO:중복제거   
 //  사용법: 1)정의부/가공/새배열 내보내기
    List<String> list2=list.stream()// 정의부
      .distinct()                   //가공
      .collect(Collectors.toList());// 새배열 내보내기
    list2.forEach(a->System.out.println(a));
}
}
