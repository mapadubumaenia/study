package chap08.section01.example02;
//실행 클래스
public class StudentApplication {
public static void main(String[] args) {
	
	Student student=new Student("홍길동", 1);
	
	System.out.println(student.name);
	System.out.println(student.no);
}
}
