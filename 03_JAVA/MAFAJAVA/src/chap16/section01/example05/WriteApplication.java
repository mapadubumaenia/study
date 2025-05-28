package chap16.section01.example05;

import java.io.FileWriter;
import java.io.Writer;

/**
 * 텍스트 파일:글자를 저장하는 파일, 
 * Writer(부모 추상클래스), FileWriter(자식 클래스)
 *  특징:더블클릭하면 볼수 있음, 1글자씩 씀!
 * 예) 기본 글자파일
 */
public class WriteApplication {
public static void main(String[] args) throws Exception {
//   사용법: 	Writer 변수 =new FileWriter("파일경로")
	Writer writer
	  =new FileWriter("src/chap16/output/test3.txt");
	
//   글자: char: 1글자 자료형(홀따옴표)
	char a='A';
	char b='B';
	
//  메모리(버퍼)에 쓰기
//  사용법) 파일변수.write(변수)	
	writer.write(a);
	writer.write(b);
	
//  하드디스크의 파일에 진짜 쓰기
	writer.flush();
	
//   파일닫기
	writer.close();
}
}
