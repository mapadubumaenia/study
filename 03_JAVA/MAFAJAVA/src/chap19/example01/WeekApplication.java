package chap19.example01;
/**
 * 실행클래스
 *
 */
public class WeekApplication {
public static void main(String[] args) {
//        열거형: 바로사용(전역 상수)
//        사용법: Week 변수=Week.전역상수;
	   Week week=Week.MONDAY;
	   System.out.println(week.getValue());
}
}
