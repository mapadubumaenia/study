package chap15.section03.example02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  스트림2: map 메소드
 *
 */
public class StreamApplication {
public static void main(String[] args) {
	
	List<String> list= new ArrayList<String>();
    list.add("a");
    list.add("a");
    list.add("B");
    
 // TODO: 배열값을 대문자로 바꿔서 (새로운 배열) 화면에 표시   
 //   글자.toUpperCase() : 대문자 바꾸기 함수  
//   사용법: 1)정의부: list.stream()  :스트림을 사용하겠다! 라는 뜻
//         2) .map(s->s.toUpperCase()): 배열의 원소 대문자로 바꿈
//                                               (반복실행)         
//    예) 0번방: "a": "a"-> "a".toUpperCase()=>"A"
//    예) 1번방: "a": "a"-> "a".toUpperCase()=>"A"
//    예) 2번방: "B": "B"-> "B".toUpperCase()=>"B"
//         3) 결과 내보내기:.collect(Collectors.toList());
//                           새 배열 내보내기(항상 고정)
    
    
    List<String> list2=list.stream()
	  .map(s->s.toUpperCase())
	  .collect(Collectors.toList());
    
    list2.forEach(a->System.out.println(a));
	
}
}
