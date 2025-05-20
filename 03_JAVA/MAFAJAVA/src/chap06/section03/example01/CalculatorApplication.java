package chap06.section03.example01;
//실행클래스
public class CalculatorApplication {
public static void main(String[] args) {
// 클래스 만들기 사용법: 클래스 변수=new 생성자함수();
//	         사용법2: 변수.필드, 변수.메소드,()
	Calculator calculator=new Calculator();
	calculator.powerOn();//전원켜기 화면표시
	
	
	calculator.minus(5); //5 화면표시
	
	calculator.plus(15,57); //값이 나오지만 따로 보내야 한다.
	// 결과가 값으로 나옴=> 1)변수에 저장하거나
//	                   2)화면표시 하기
	System.out.println(calculator.plus(15,57));
}
}
