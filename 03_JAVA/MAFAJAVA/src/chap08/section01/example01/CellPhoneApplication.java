package chap08.section01.example01;
//실행 클래스
public class CellPhoneApplication {
public static void main(String[] args) {

	
// 클래스 만들기 사용법: 클래스 변수 =new 생성자 함수();
DmbCellphone dmbCellphone= new DmbCellphone("자바", 10);

    System.out.println(dmbCellphone.channel);	
    System.out.println(dmbCellphone.model);	
}
}
