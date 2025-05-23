package chap14.section01.example03;

import java.util.ArrayList;
import java.util.List;

/**
 * list 자식클래스: ArrayList,LinkedList, Vector
 * ArrayList 클래스 넣기
 * vector: 마지막챕터에 멀티쓰레드환경에서 사용합니다.(특별한 환경)
 *          =>멀티스레드 1프로그램에서 동시에 2가지 실행되는 작업
 *          (추가/수정/삭제 함수는 모두 모양이 같습니다)
 */
public class BoardApplicaton {
public static void main(String[] args) {
//인터페이스 사용법: 인터페이스<클래스자료형> 변수 =new 자식생성자<>();
	List<Board> list=new ArrayList<Board>();
//TODO: 변수.add(값), 변수.add(new 생성자함수());
	
	
	list.add(new Board("제목","내용"));
	list.add(new Board("제목2","내용2"));
	System.out.println(list);
	

//배열의 크기: 배열변수.length == list.size()	
	for (int i = 0; i < 2; i++) {
		System.out.println(list.get(i).subject);
		System.out.println(list.get(i).content);
	}
	
	
}
}
