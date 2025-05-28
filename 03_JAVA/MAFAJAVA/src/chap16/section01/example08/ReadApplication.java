package chap16.section01.example08;

import java.io.FileReader;
import java.io.Reader;

/**
 * 텍스트 파일 읽기: Reader(부모 추상클래스),FileReader(자식클래스)
 *          다른 자식클래스 예) BufferedReader등등..
 *  특징: 기본적으로 글자 1자씩(char:2byte)읽기
 */
public class ReadApplication {
public static void main(String[] args) throws Exception {
//  클래스 변수= new 자식생성자("파일경로");	
//   사용법: 	Reader 변수=new FileReader("파일경로")
	Reader reader
	  =new FileReader("src/chap16/output/test4.txt");
	
//  파일 읽기: 글자가 몇개인지 모름=>무한 반복문!, (파일 끝:-1(종료조건)break)
      while (true) {
 // 읽은 것은 아스키코드가 됩니다, 아스키코드 글자바꾸기:(char)코드
 // 사용법: int 읽은값= 변수.read(); //1자씩 읽기, 결과:아스키코드로 나옴   	  
		int data=reader.read();
		
		if (data==-1)break; {  //종료조건
			System.out.println((char)data);
		}
	}	   
	reader.close();
}
}
