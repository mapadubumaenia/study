package chap05.section02;

public class S97_Mafa {
public static void main(String[] args) {
	int[] a = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
    int[] even=new int [10];
    int idx=0;
    
    for (int i = 0; i < a.length; i++) {
		if (a[i]%2==0) {
			even[idx]=a[i];
			idx++;
		}	
	}
   System.out.println("짝수들");
    for (int i = 0; i < idx; i++) {
		System.out.println(even[i]);
	}
}
}
