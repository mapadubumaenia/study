package chap12.section01.example02;
/**
 * ArrayIndexOutOfBoundsExcetion 오류
 * =>배열에 2개밖에 없는데 5번째 값을 조회할경우 발생
 *  
 *
 */
public class ArrayIndexOutOfBoundsExcetion {
public static void main(String[] args) {
	
	int[] a= {1,2};  //개수:2개, a[0]=1, a[1]=2
	System.out.println(a[5]); //에러발생
}
}
