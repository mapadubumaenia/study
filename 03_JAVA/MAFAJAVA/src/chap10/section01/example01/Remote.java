package chap10.section01.example01;
//인터페이스
public interface Remote {
// 클래스의 3요소:  1)필드  2)생성자함수  3)메소드
// 지만... 이건 interface  	
//        필드는 전역상수가 되고 메소드는 추상메소드가 된다.
// 사용법 : public interface 인터페이스명{}	
	
// 	필드=>전역상수
// 원래 전역상수는 static final을 써야하지만 
//	인터페이스에선 안써도 필드가 전역상수가 된다. 	
   int MAX_VOLUMN=10;  //필드? 가 아니고 상수! (전역상수)
   
// 메소드=> 추상메소드   
   void trunOn();
   
}
