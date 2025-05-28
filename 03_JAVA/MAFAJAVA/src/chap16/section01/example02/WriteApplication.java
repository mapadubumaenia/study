package chap16.section01.example02;
/**
 * 이진파일 쓰기: 배열이용
 *
 */

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteApplication {
   public static void main(String[] args) throws Exception {
	   OutputStream outputStream
       =new FileOutputStream("src/chap16/output/test2.db");
	   
	   byte[]arr= {10,20};
	   
//     버퍼(메모리)방에 쓰기
	   outputStream.write(arr);
	   
//     하드디스크 쓰기
	   outputStream.flush();
	   
//     파일 닫기
	   outputStream.close();
}
}
