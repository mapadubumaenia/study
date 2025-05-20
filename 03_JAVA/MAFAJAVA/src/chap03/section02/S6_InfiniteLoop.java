package chap03.section02;

public class S6_InfiniteLoop {
	public static void main(String[] args) {
		int i = 1;
		while (true) { //"값이 참인동안은 무한반복"
			System.out.println(i);
			if (i == 6) {
				break;
				//중단조건: if 조건문
			}
			i++; //1씩증가
		}
	}
}
