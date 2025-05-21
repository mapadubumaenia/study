package chap08.section02.example03;
//실행클래스
public class ChildApplication {
public static void main(String[] args) {
	
//클래스 만들기(다형성): 부모클래스 변수=new 자식생정자함수();	
	Parent parent=new Child();
	parent.method1();
// TODO: 부모변수에서 자식을 다시 꺼내고 싶을 때 어떻게?		
// 자료형변환: 1)작은 자료형=(작은자료형)큰자료형;
//	상속관계:  자식클래스 변수=(자식클래스) 부모변수;
//	작은 자료형에서 큰자료형으로 옮길때 앞에 long을 쓰듯이 
//	부모변수에서 자식을 다시 꺼낼떄는 (자식클래스)를 붙인다(캐스팅)
	Child child=(Child) parent;
	child.method2();
	
	
	
	
	
	
	
	
	
}
}
