package chap15.section02.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * 제네릭 표기: 클래스<클래스자료형>
 * 용도: 클래스 넣을때 작성한 자료형만 들어가게 만드는 것
 * 제네릭 실습:
 *
 */
public class S1_GenericApplication {
public static void main(String[] args) {
// 클래스<클래스자료형> 변수=new 생성자<클래스자료형>();	
// 인터페이스<클래스자료형> 변수=new 자식생성자<클래스자료형>();	
	List<Product> parents= new ArrayList<Product>();
	List<Audio> child= new ArrayList<Audio>();
	
// TODO:제네릭을 상속관계에서는? = 자식클래스는 배열에 들어감
	parents.add(new Audio());   //부모배열에 자식 들어감o
//	child.add(new Product());   //자식배열에 부모 들어가지않음 x
	System.out.println(child);
}
}
