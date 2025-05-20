package chap01.section03;

public class S3_Asci {
public static void main(String[] args) {
// 아스키코드(문자표):코딩테스트 문제로 나올 수 있음,실무에서는 x
// 컴퓨터 대화:숫자(2진수:0,1)만 암, 글자는 모름
//=> 특정 숫자<->글자와 매칭 예)1-> a 글자와 같음(아스키 코드)
// =>유니코드: 전세계 국가가 컴퓨터와 대화 가능(국제표준)	
	char a='A'; //2byte
	int b=a;    //4byte
	System.out.println(b);
	
	//작은 크기의 char에 정수화된 int b를 넣으려면 
	//강제 자료형 변환을 써야함.
	char c=(char)b; 
	System.out.println(c);
}
}
