package chap05.section02;


//결론부터 말하자면 얇은 복사는 사용하지 마세요!
// *배열: 크기를 정할수 없음=> 힙방

//int[] o= {1,2};
//int[] n=o;  n은 o배열의 값을 복사한게 아닌 방 번호를 복사해버림
//n[0]=10; n[0]의 값을 10으로 바꾸면 방번호에 해당하는 원본을 수정해버림

//         스택방                힙방
//         --------------------------     
//         이름  값             방번호 값
//         o    1               1  1
//                              2  2
//         n    1                    
                              
                              

public class S2_ShallowCopy {
public static void main(String[] args) {
	int []o= {1,2}; //원본 배열
	System.out.println(o[0]); //1이 출력됨
	
	int[] n=o; //배열을 복사(얇은 복사) *이렇게하면안됨
	System.out.println(n[0]); //1이 출력, 잘 복사됬음
	n[0]=10;//n배열의 값 수정(복사본)
	System.out.println(n[0]);//10이 출력됨 (값 수정됨)
	System.out.println(o[0]);//원본이 수정되어버림?????
	                         //  니는 왜 수정됬노???
	
}
}
