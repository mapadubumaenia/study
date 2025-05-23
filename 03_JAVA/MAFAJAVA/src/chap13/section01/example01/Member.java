package chap13.section01.example01;

public class Member {
public String id;

public Member(String id) {
	super();
	this.id = id;
}
//TODO: equals(), hashCode() 메소드 오버라이딩: 객체 동등비교가 해결됨

//hash코드 뜻
// => 변수를 저장하면 컴퓨터 메모리공간에 저장(저장공간:방), 방번호(메모리 주소)
//    공식에 의거하여 방번호를 구함(중복 되지않게)
//    결론: 저장공간의 방번호를 구할때 사용하는 번호(숫자)가 hash
//    ex)방번호:xxxx
//해쉬함수 : 해쉬번호를 구해주는 함수
//     특징) "a" :해쉬함수에 넣음 ->해쉬번호:1
//        "a": 한번더 해쉬함수에 넣으면-> 해쉬번호:1
//      결론) 입력값에 동일하면 항상 결과도 동일함

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
