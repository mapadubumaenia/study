package chap13.section01.example03;
/**
 * system 클래스 nanoTime(): 1/10^9 시간 측정(스톱워치 처럼 숫자로 측정)
 *
 */
public class SystemTimeApplication {
public static void main(String[] args) {
	

	//1~1000000(백만) 반복문 누적합 구해보겠습니다. (시간 측정) 공식:sum=sum+누적값;
	// TODO 1)처음시간 측정:변수저장
	  long a=System.nanoTime();
	  
	  
	 //반복문 실행
	  int sum=0;
	  for (int i = 1; i <=1000000; i++) {
		sum=sum+i;
	}
//TODO : 끝 시간 측정: 변수저장(b)
	  long b=System.nanoTime();
	  System.out.println(b-a);
	  
}
}
