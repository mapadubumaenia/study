package chap13.section01.example01;

public class MemberApplication {
public static void main(String[] args) {
	Member member=new Member("blue");
	Member member2=new Member("blue");
	
// 같은 지 비교: 글자 equals(),member==member2 (개발자 입장:같다)
// TODO: 1)개발자 입장: 필드의 값이 같으면 같은 객체다(.equals())
//	     2) .equals(): 기본적으로 스택방(메모리)번호를 비교
//       =>자바 모든 개발도구: 자동화기능: eqauals()메소드 오버라이딩해야함(값 비교)
//	   함수 equals는 필드의 값을 비교하지만 .equals는 메모리 방을 비교하는것
//      3)해뷔(번호)를 만약에 객체를 동등비교한다면 결과가 똑같이 나오게 해야합니다.
//      =>기본적으로 자바는 해쉬번호를 방번호로 비교=> (해결) 메소드 오버라이딩을 해야함(값 비교)
	
	if (member.equals(member2)) {
		System.out.println("같다");
	}else {
		System.out.println("다름");
	} //equals hashCode 안쓰면 다름으로 나옴,
	 // 쓰면 같음으로 나옴
}
}
