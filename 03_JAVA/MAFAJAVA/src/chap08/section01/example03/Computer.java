package chap08.section01.example03;
//자식클래스
//상속을 받았는데 부모의 코딩이 마음에 안들어서 수정하고 싶을때*
//메소드 오버라이딩*
public class Computer extends Calculator {

	@Override
	public double circle(double r) {
		// TODO Auto-generated method stub
	return r*r*Math.PI; //PI(3.14159,,,) 정밀도 높음
	}
      
	
}
