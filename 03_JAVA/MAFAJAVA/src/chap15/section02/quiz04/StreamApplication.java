package chap15.section02.quiz04;

import java.util.ArrayList;
import java.util.List;

public class StreamApplication {
public static void main(String[] args) {
	
	List<String> list= new ArrayList<String>();
    list.add("a");
    list.add("B");
    list.add("B");
	
	list.forEach(s->System.out.println(s));
}
}
