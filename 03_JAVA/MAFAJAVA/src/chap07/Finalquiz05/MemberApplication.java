package chap07.Finalquiz05;

public class MemberApplication {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		memberService.login();
		memberService.logout();
	}

}
