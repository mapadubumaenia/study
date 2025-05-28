package chap16.section01.example03;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 이진 파일 읽기: InputStream(부모 추상클래스), FileInputStream(자식 클래스) 예) 자식클래스 예:
 * DataInputStream 등등.. 대상: 이미지파일 읽기, 동영상 파일 읽기 등
 *
 */
public class ReadApplication {
	public static void main(String[] args) throws Exception {
		// 사용법:InputStream 변수= new 자식생성자("작성된 파일경로");
		InputStream inputStream = new FileInputStream("src/chap16/output/test1.db");

//   파일 읽기: 숫자가 몇개 작성되었는지 모름
//	       => 파일을 끝까지(숫자가 없으면-1)읽어서(반복문) 화면에 표시하는 방법
//         =>무한반복문 사용: 종료조건(값==-1) break;	
		while (true) {
			// 사용법: int 읽은값변수=파일변수.read(): 파일 읽기 메소드
			int data = inputStream.read();

//   종료조건:(값==-1)
			if (data == -1)
				break;
			{
				System.out.println(data);
			}

		}
		inputStream.close();
	}
}
