package chap03.section02;

public class S5_ForInFor {
	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("---" + dan + "단" + "---");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "X" + i + "=" + (dan * i));
			}
		}
	}
}
