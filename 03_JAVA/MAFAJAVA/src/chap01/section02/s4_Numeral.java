package chap01.section02;

public class s4_Numeral {
	public static void main(String[] args) {
		String a = Integer.toBinaryString(10);
		String b = Integer.toOctalString(10);
		String c = Integer.toHexString(10);
//  TODO: 객체(그룹핑): 변수 여러개를 묶어서 관리(목적에따라서)
		
		//toBinaryString 2진수
		//toOctalString 8진수
		//toHexString 16진수
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
