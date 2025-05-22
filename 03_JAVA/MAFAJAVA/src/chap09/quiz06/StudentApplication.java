package chap09.quiz06;

public class StudentApplication {
	public static void main(String[] args) {
		Student student = new Student("홍길동");
		student.setId("1234567");
		System.out.println(student.getName()); // 홍길동
		System.out.println(student.getId()); // 1234567
	}

}
