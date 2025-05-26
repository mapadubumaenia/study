package chap14.section01.example08;
/**
 * 
 *
 */
public class Student {

	public int sno;         //학번
	public String name;     //이름
	
// 생성자 매개변수 2개, 자동화코드로 생성
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	
// Map자료구조도 중복체크를 해야한다~!: equals(), hashCode() 오버라이딩 해야함
//  자동화 코드로 생성	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sno;
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sno != other.sno)
			return false;
		return true;
	}


// 객체를 화면표시 하기 위한 오버라이딩 toString()
//자동화 코드로 생성
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
}
