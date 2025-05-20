package chap06.section02.example02;

public class KoreanApplication {
public static void main(String[] args) {
	Korean korean =new Korean("홍길동", "960516");
	
	System.out.println(korean.name);
	System.out.println(korean.ssn);
	
	
	Korean korean2 =new Korean("임꺽정", "970813");
	
	System.out.println(korean2.name);
	System.out.println(korean2.ssn);
}
	
}
