package chap16.section01.example09;

import java.io.FileReader;
import java.io.Reader;

/**
 * 텍스트 파일 읽기: 배열의 크기만큼 1방에 읽기(속도 증가)
 *
 */
public class ReadApplication {
public static void main(String[] args) throws Exception{
//    클래스 변수=new 자식생성자("파일 경로")
	Reader reader
	  =new FileReader("src/chap16/output/test4.txt");
	
//   배열 준비	
	char[] space=new char[100];
	
//   파일 읽기(무한 반복문 이용), 파일의 끝: -1(반복문 종료:break;)	
	while (true) {
//     읽은 글자는 space 배열에 저장,num에는 읽은 개수가 저장됨		
		int num=reader.read(space);
//     종료조건: num==-1, 반복문 종료:break;
		if (num==-1) {break;}
//     num까지 반복하면서 화면표시
		for (int i = 0; i < num; i++) {
			System.out.println(space[i]);
		}
	}
	reader.close();
}
}
