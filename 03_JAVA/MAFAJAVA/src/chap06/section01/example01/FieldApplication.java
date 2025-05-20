package chap06.section01.example01;

public class FieldApplication {
public static void main(String[] args) {
	
// 객체 사용법1) 클래스명 변수=new 생성자함수();
	Field field = new Field();
	
//정수 확인
//정수 초기값(컴퓨터가 넣어둠):0	
	System.out.println(field.byteVal);
	System.out.println(field.shortVal);
	System.out.println(field.intVal);
	System.out.println(field.iongVal);
	
//실수 초기값 = 0.0
	System.out.println(field.floatVal);
	System.out.println(field.doubleVal);
	
//참/거짓 초기값= false
	System.out.println(field.booleanVal);
	
//  글자, 배열 초기값= null (아무것도 없음을 뜻하는 예약어)
	System.out.println(field.stringVal);
	System.out.println(field.arrayVal);
	
// 글자1개 char 초기값=char 필드는 값을 넣지 않으면 화면에 표시되지 않습니다.
	System.out.println(field.charVal);
}
}
