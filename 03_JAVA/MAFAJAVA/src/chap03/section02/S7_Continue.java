package chap03.section02;

public class S7_Continue {
public static void main(String[] args) {
	for (int i = 1; i <= 10; i++) {
		
		if(i==3) {
			continue;
		// 예약어: 반복문에서 이녀석을 만나면 아래줄은 실행하지 않고
		// 재반복함.	
		}
		System.out.println(i);
	}
}
}
