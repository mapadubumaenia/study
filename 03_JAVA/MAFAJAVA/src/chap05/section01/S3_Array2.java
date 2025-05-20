package chap05.section01;
//배열을 만드는 2번째 방법
public class S3_Array2 {
public static void main(String[] args) {
//	double[]a= {0.1,0.2,0.3,0.4}; 첫번째 방법(일반적)

//  new 키워드를 이용한 2번쨰 방법(방예약)	
	double[] a= new double[4]; //힙방에 방 4개예약
	a[0]=0.1;
	a[1]=0.2;
	a[2]=0.3;
	a[3]=0.4;
	System.out.println(a[0]);
}
}
