package chap03.section01;

public class S5_Switch {
public static void main(String[] args) {
	int a=8;
	switch (a) {
	case 9:
		System.out.println("출발");
		break;
	case 8:
		System.out.println("준비");
		break;
	default:System.out.println("대기");
		break;
	}
	//break;를 만나면 그밑의 함수를 적용하지 않고 식을 빠져나온다.
	//변수가 값1이면 실행문 실행
//	변수가 값2이면 실행문2 실행
//	모두 아니면 실행문3 실행
}
}
