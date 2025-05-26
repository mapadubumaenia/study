package chap14.section03.example02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 참고) Collections 클래스의 유용한 함수 소새
 * List, Set , Map
 *
 */
public class CollectionsApplication {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	
//  1)리스트에 값을 편하게 (한방에) 넣기 : Collections.addAll(리스트,값1,...)
	Collections.addAll(list,1,2,3);
	System.out.println(list);  //[1,2,3]
	
	
//  2)리스트 값을 오른쪽으로 회전 시키기	: Collections.rotate(리스트,칸이동)
//	칸이동: 양수(오른쪽), 음수(왼쪽)
	Collections.rotate(list,1);
	System.out.println(list);    // [3,1,2]
	
	
//  3)리스트 값들을 서로 교환하기(swap)
	Collections.swap(list, 0, 1);
	System.out.println(list);  //  [1,3,2]
	
	
//  4)리스트 정렬: 내림차순/
	Collections.sort(list, Collections.reverseOrder());
	System.out.println(list);    //[3,2,1]
	
	
//  5)리스트 정렬: 오름차순
	Collections.sort(list);
	System.out.println(list);   //[1,2,3]
	
	
//  6)최대값/ 최소값 구하기
	System.out.println(Collections.max(list));  //3  최대값
	System.out.println(Collections.min(list));  //1  최소값
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
