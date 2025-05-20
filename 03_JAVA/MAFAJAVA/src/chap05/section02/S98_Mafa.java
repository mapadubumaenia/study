package chap05.section02;

public class S98_Mafa {
public static void main(String[] args) {
	int[] a = {1, 4, 5, 8, 11, 13, 16, 19, 22, 25};
	int check=0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]%2==1) {
			check++;
		}
	
	}
	System.out.println(check);
}
}
