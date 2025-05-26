package chap14.section02.example04;
/**
 * 실행클래스
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {
public static void main(String[] args) {
	
	Queue<Coin> queue=new LinkedList<Coin>();
	
	
// 추가사용법: 변수.offer(new 생성자());
	queue.offer(new Coin(100));
	queue.offer(new Coin(50));
	System.out.println(queue);
	
// 꺼내기 사용법: 변수.poll();	
	Coin coin=queue.poll();
	System.out.println(coin);
	
// 꺼내기 사용법: 변수.peek();		
	System.out.println(queue.peek());    
	
	
	
	
	
	
	
	
	
	
	
	
}
}
