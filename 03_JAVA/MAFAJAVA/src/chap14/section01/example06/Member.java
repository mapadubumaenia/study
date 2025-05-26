package chap14.section01.example06;

public class Member {
//필드
	public String name;  //이름
	public int age;      //나이
	
//생성자 매개변수 2개	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//집합에 객체를 넣기:중복제거(내부적으로 객체가 같은지 비교) 
//2가지: equals(), hashCode() 오버라이딩(재정의) 해야함

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//객체 화면표시: 주소값이 표시->필드갑을 보기: toString() 오버라이딩	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
