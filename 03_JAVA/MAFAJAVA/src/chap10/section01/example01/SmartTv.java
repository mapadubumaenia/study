package chap10.section01.example01;
//자식 클래스
//interface는 상속을 여러개 받을 수 있다!
//인터페이스 상속은 <implements>를 사용
//주의점: 메소드 오버라이딩 필수!

public class SmartTv implements Remote, Searchable{
//상속받으면 메소드 오버라이딩 해야함: 부모가 추상메소드를 가지고 있으니까.
	
	@Override
	public void search(String url) {
     System.out.println(url + "검색");		
	}

	@Override
	public void trunOn() {
      System.out.println("티비켜기");		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
