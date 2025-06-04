-- 예제) 사원 테이블에서 근무 일수를 구해서 화면에 표시하세요
-- 단, 소수점을 반올림해서 정수로 표시하세요
-- 근무 일수: 현재 날짜(SYSDATE)-입사일 (결과: 일(day))
-- 사원 테이블명: EMPLOYEE
-- 입사일      : HIREDATE
-- 사용법) SELECT ROUND(숫자,화면표시할자리수) FROM DUAL;

---- 참고) SYSDATE 함수(속성) : 
--현재 날짜 가져오는 함수(자료형: 날짜형(DATE), 년/월/일/시/분/초 까지 표시(일부만 표시가능)


SELECT ROUND(SYSDATE-HIREDATE) FROM EMPLOYEE;