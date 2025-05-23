package chap13.section02.example01;

import java.util.Calendar;
/**
 * 과거 날짜 함수들 소개: date,calender 클래스의 함수들
 *
 */
import java.util.Date;

public class DateApplication {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());
		
		
//년/월/일 분리해서 화면에 표시하기: Calender
		Calendar b=Calendar.getInstance();
		int y=b.get(Calendar.YEAR);
		int m=b.get(Calendar.MONTH);
		int d=b.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);

	}
}
