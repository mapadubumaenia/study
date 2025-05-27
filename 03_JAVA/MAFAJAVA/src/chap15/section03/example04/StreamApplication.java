package chap15.section03.example04;
/**
 * skip(개수): 배열 원소를 처음부터 지정개수만큼 건너뛰어서 새배열 만들기
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
    list.add("a");
    list.add("a");
    list.add("B");
    
    
//  TODO: .skip(건너뛸 개수) 건너뛰어 새배열 만들기    
    List<String>list2= list.stream()  //정의부
    		.skip(1)                  //가공
    		.collect(Collectors.toList()); //새배열 내보내기
    list2.forEach(a->System.out.println(a));
}
}
