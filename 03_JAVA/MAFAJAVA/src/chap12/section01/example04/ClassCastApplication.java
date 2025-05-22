/**
 * 
 */
package chap12.section01.example04;

/**
 * @author user
 *
 */
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

// ClassCastException 오류: 부모에 넣은 것은 cat 인데 dog 바꿀때 발생
public class ClassCastApplication {
	
//	함수의 매개변수의 다형성
//	전역 메소드 : pu
	public static void name(Animal animal) {
//		자식클래스 변수=(형변환)부모클래스;
	//	Dog dog=(Dog)animal;
	}
	public static void main(String[] args) {
		Cat cat=new Cat();
		name(cat);
	}
}