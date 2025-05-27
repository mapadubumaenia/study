package chap15.section03.example05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * limit(개수) 배열에서 개수만큼만 새배열 만들기
 *
 */
public class StreamApplication {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
    list.add("a");
    list.add("a");
    list.add("B");
    
 //TODO:  .limit(개수) 배열에서 개수만큼만 새배열 만들기
    List<String>list2=list.stream() //정의부
    		.limit(1)               //가공
    		.collect(Collectors.toList()); //새배열 내보내기
    list2.forEach(a->System.out.println(a));
    
}
}
