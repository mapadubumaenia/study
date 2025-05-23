package chap13.section01.quiz01;

public class MemberApplication {
	public static void main(String[] args) {
		Member member = new Member("홍길동");
		Member member2 = new Member("홍길동");
		if (member.equals(member2)) {
			System.out.println("member 와 member2 는 같습니다.");
		} else {
			System.out.println("member 와 member2 는 다릅니다.");
		}
	}

}
