package chap01.section03;

public class S2_Casting {
public static void main(String[] args) {
// TODO:강제 정수 변환: int 변수=(int)변수2;
	long a=1;
	int b=(int)a;
	System.out.println(b);
// TODO:강제 실수 변환: float 변수=(float)변수2;
	double c=1.5;
	float d=(float)c;
	System.out.println(d);
//TODO:큰 변수에서 작은 변수로 변환은 에러표시가 난다.
//     넣기 전에 (작은 자료형)이라고 표시를 해줘야 함.
//     이것을 강제 자료형 변환(Casting) 이라고 함.	
}
}
