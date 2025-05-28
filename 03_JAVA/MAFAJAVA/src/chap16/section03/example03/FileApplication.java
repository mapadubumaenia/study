package chap16.section03.example03;

import java.io.File;
import java.util.Arrays;

/**
 * File 클래스 소개: 폴더/파일 모두 만들 수 있음
 *
 */
public class FileApplication {
public static void main(String[] args) throws Exception {
//
	File folder=new File("src/chap16/result");
//  사용법: 변수.mkdir(): 폴더만들기 메소드
	folder.mkdir();
	
	
	File file=new File("src/chap16/result/file1.txt");
//  사용법:
	file.createNewFile();
	
//  만들어진 폴더/파일의 정보도 줍니다.
	File[] a=folder.listFiles();
	System.out.println(Arrays.toString(a));
}
}
