package chap13.section01.example01;

public class Member {
public String id;

public Member(String id) {
	super();
	this.id = id;
}
//TODO: equals(), hashCode() 메소드 오버라이딩: 객체 동등비교가 해결됨

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
}
