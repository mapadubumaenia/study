package chap15.section02.example03;

@FunctionalInterface
interface MyScience{
	int score();
}
/**
 *  람다식2
 *
 */

public class S2_RamdaApplication {
public static void main(String[] args) {
//     인터페이스 변수=new 인터페이스(){}
	MyScience m=new MyScience() {
		
		@Override
		public int score() {
			// TODO Auto-generated method stub
			return 70;
		}
	};
//   메소드 실행
	System.out.println(m.score());
	
//  TODO 람다식: int함수라서 return을 쓴 오버라이딩이라면 람다식에선 return을 생략하고 바로 값적으면됨
	MyScience m2=()->70;
	System.out.println(m2.score());

}
}
