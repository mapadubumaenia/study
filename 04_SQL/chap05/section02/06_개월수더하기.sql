--£ 개월 수 더하기 함수
--① 예제) 입사일에서(HIREDATE) 6 개월이 지난 시점에 날짜 구하기


SELECT HIREDATE,ADD_MONTHS(HIREDATE,6)
 FROM EMPLOYEE;
