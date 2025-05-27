package chap15.section03.example06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  filter(): 람다식이 참인것만 새로운 배열 만들기
 *
 */
public class StreamApplication {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
    list.add("a");
    list.add("a");
    list.add("B");
    
 //TODO: filter(람다식): 람다식이 참인것만 새배열 만들기
    List<String>list2=list.stream()    //정의부
   		.filter(s->s.equals("a"))       //가공
    	.collect(Collectors.toList());  //새배열 내보내기
    list2.forEach(a->System.out.println(a));
}
}
