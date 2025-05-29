package chap17.example05;
/**
 * 내부클래스에서 this 사용?
 * this: 클래스 자기자신을 의미
 *  vs super: 부모클래스를 의미
 */
public class Outer {
	public void name() {}        //외부클래스 메소드

//  내부클래스 정의
      class Inner{
    	  public void name2() {} //내부클래스 메소드
    	  public void name3() {
    		  this.name2();
//           사용법:외부클래스명.this.메소드();
    		  Outer.this.name();
    	  }
      }

}
