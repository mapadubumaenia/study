package chap08.section02.example01;
//실행 클래스
public class ChildApplication {
public static void main(String[] args) {
	
	Child child =new Child();
	Child2 child2=new Child2();
//다형성: 1)코드를 조금만 추가해서 다양한 결과를 나타낼 수 있는 기능
// 조건: 1)부모-자식관계 상속을 사용해야함.
//      2)자식쪽에 메소드 오버라이딩을 사용해야 합니다.
//      (부모 객체에 자식을 넣은 함수를 실행하면=> (1) 부모함수x  (2) 자식함수실행! 	
// 사용법: 부모클래스 변수 = 자식클래스;	
	Parent parent=child;  //자식1
   parent.method();
   parent=child2;     //자식2
   parent.method();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
