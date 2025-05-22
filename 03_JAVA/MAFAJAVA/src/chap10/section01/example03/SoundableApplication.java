package chap10.section01.example03;

public class SoundableApplication {
//메소드(함수)	
  public static void print(Soundable soundable) {
		System.out.println(soundable.sound());
	}
     public static void main(String[] args) {
	
    	 
//  클래스 사용법: 클래스 변수= new 생성자함수();
//  인터페이스 사용법 = 인터페이스 변수 =new 자식생성자함수()  (다형성)
//   함수의 매개변수로 다형성: 함수(인터페이스 변수), 함수(자식변수)     	 
//    	 
    	 
    	 Cat cat=new Cat();
    	 Dog dog=new Dog();
    	 print(dog);
    	 print(cat);
    	 
    	 
    	 
    	 
    	 
	}
}
