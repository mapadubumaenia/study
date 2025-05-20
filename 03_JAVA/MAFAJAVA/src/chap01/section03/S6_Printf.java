package chap01.section03;

public class S6_Printf {
public static void main(String[] args) {
	System.out.printf("%d",10);
	System.out.println();//줄바꿈을 포함하고 있음
    //%d 의 d는 정수를 의미함,	
	//사용법:System.out.printf("%d",정수);
	
	System.out.printf("%s","hi");
	System.out.println();
	//%s 의 s는 글자를 의미함
	//사용법:System.out.printf("%s","글자");
	
	System.out.printf("%x",10);
	System.out.println();
	//%s 의 x는 16진수를 의미함
	//사용법:System.out.printf("%x",숫자);
	
	System.out.printf("%.3f",3.14127);
	System.out.println();
	//사용법:System.out.printf("%.자리수f",실수);

	
}
}
