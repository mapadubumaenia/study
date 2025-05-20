package chap05.section02;
//깊은복사: 권장하는 방식, 반복문 사용해서 값넣기
//복사하고 싶은 배열의 주소(방번호)를 복사하는게 아니라 값을 복사해서 
//새로운 배열에 값을 추가하는 방식
       
//        int[] o= {1,2}; 
//        int[] n=new int[2];
//        스택방           힙방
//        ----------------------
//        이름 값          방번호 값
//        o   0            0  1   (그대로)
//                         1  2
//        n   2            2  10 (값을 1에서 10으로 수정해도)    
//                         3  2

public class S3_DeepCopy {
public static void main(String[] args) {
	int[] o= {1,2}; //원본 2개
	int[] n =new int[2];  //방예약 2개
	System.out.println(o[0]);  //1이 출력됨 
	for (int i = 0; i < n.length; i++) {
		n[i]=o[i];
	// 깊은 복사: 반복문 이용, 원본 훼손 없음	
	}
	n[0]=10; //수정해보기
	System.out.println(n[0]); //수정된 복사본
	System.out.println(o[0]); //수정되지 않고 안정된 원본
	
}
}
