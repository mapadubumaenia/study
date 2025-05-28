package chap16.section01.example06;

import java.io.FileWriter;
import java.io.Writer;

/**
 * 텍스트파일: 배열 이용
 *
 */
public class WriteApplication {
public static void main(String[] args) throws Exception {
//   사용법:	Writer 변수=new FileWriter("파일경로");
	Writer writer
	  =new FileWriter("src/chap16/output/test4.txt");
	
//  배열 이용	
	char [] arr= {'A','B','C'};
	
//  메모리(버퍼)에 쓰기
//  사용법: 파일변수.write(배열변수)	
	writer.write(arr);
	
//  하드디스크에 진짜 쓰기
	writer.flush();
	
//  파일 닫기
	writer.close();
}
}
