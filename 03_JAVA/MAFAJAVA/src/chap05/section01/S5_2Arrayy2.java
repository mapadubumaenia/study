package chap05.section01;

public class S5_2Arrayy2 {
public static void main(String[] args) {
	int [][]a=new int[2][2];
// 방예약  밖:2개, 안:2개	
// 사용법: int[][] 변수=new int[밖예약개수][안예약개수];	
// 사용법2:  a[밖방번호][안방번호]=값;	
	a[0][0]=1;
	a[0][1]=2;
	a[1][0]=3;
	a[1][1]=4;
	System.out.println(a[0][0]);
}
}
