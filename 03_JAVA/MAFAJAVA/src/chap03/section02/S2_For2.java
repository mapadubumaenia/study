package chap03.section02;

public class S2_For2 {
public static void main(String[] args) {
	int sum=0;
	for (int i = 1; i <= 10; i++) {
		sum=sum+i;
	}
	System.out.println(sum);
// 누적합: 합을 계속 연달아서 누적시키는 것
//  예) :1+2=>3	
//      :3+2=>5	
//      :5+2=>7	
}
}
