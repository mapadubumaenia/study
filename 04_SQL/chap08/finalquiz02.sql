--£ 관리자(MANAGER) 수를 표시하세요 

SELECT COUNT(MANAGER) FROM EMPLOYEE;


--£ 월급(SALARY) 최고액, 급여 최저액의 차액을 표시하세요

SELECT MAX(SALARY)-MIN(SALARY) AS 차액 FROM EMPLOYEE;


--£ 부서 번호별로 부서 번호(DNO), 사원 수, 평균 급여를 표시하세요
--단, 실수는 1 째 자리 반올림하세요

SELECT DNO
,COUNT(*)
,ROUND(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DNO;
