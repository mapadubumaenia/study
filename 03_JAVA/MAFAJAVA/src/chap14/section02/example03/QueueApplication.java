package chap14.section02.example03;
/**
 * 큐: 인터페이스, 자식클래스 :LinkedList
 * -특징: 여러가지 값을 저장, 처음 들어간 값이 꺼낼때 나옴(FIFO: First In First Out)
 */
import java.util.LinkedList;
import java.util.Queue;

//실행클래스
public class QueueApplication {
public static void main(String[] args) {
	
// 클래스<클래스자료형> 변수 new 생성자함수<>();	
// 인터페이스<클래스자료형> 변수 new 자식생성자함수<>();	
	
	Queue<Integer> queue=new LinkedList<Integer>();
	
	
// 추가사용법: 변수.offer(값)
	queue.offer(1);
	queue.offer(2);
	System.out.println(queue);
	
// 처음 값 꺼내기 사용법: 변수.poll()
	System.out.println(queue.poll());     //1 처음 들어간 값이 나옴
	
// 처음 값 조회하기 사용법: 변수.peek()
	System.out.println(queue.peek());     //2 
	
}
}
