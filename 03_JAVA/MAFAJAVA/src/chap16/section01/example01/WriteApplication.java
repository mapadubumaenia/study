package chap16.section01.example01;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 이진 파일: 1)쓰기 2)읽기 쓰기: OutputStream 
 * 이진 파일(binary file) : 예)목적: 이미지파일, 동영상파일 등
 * 읽기: 특수한 읽기 도구가 필요함(이미지 뷰어 프로그램)
 * 파일 처리: 쓰기/읽기, 반드시 예외처리 해야함 1)try/catch,
 *                                  2)throw
 *  쓰기: (화면 출력):  OutputStream(부모클래스),FileOutputStream(자식클래스)
 *                               자식클래스 종류:DataOutputStream 등...
 */
public class WriteApplication {
	public static void main(String[] args) throws Exception {
// 사용법: OutputStream 변수 =new FileOutputStream("파일경로");
		OutputStream outputStream = new FileOutputStream("src/chap16/output/test1.db");

//   byte:정수형(1byte)
//   파일에 적을 변수		
		byte a = 10;
		byte b = 20;

	
//     사용법: 파일변수.write(변수): 쓰기 메소드 실행		
		outputStream.write(a);
		outputStream.write(b);

		
//     파일에 쓰기 작업: dram(10,20) ->하드디스크(파일 :10,20)
//      사용법: 파일변수.flush()  :이때 바로 하드디스크 파일에 씁니다.		
		outputStream.flush();
//      사용법:  파일변수.close () :파일 닫기(열고 있으면 다른사람이 편집못함)		
		outputStream.close();
	}
}
