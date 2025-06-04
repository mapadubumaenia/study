--£ 모든 사원의 월급 최고액, 최저액, 총액 및 평균 급여를 화면에 표시하세요

SELECT MAX(SALARY) AS 최고액
,MIN(SALARY) AS 최저액
,SUM(SALARY) AS 총액
,TRUNC(AVG(SALARY)) AS 평균급여
FROM EMPLOYEE;




--£ 직위(JOB)별로 월급 최고액, 최저액, 총액 및 평균액을 화면에 표시하세요
--단 실수가 나오면 반올림 해주세요

SELECT JOB
,MAX(SALARY) AS 최고액
,MIN(SALARY) AS 최저액
,SUM(SALARY) AS 총액
,ROUND(AVG(SALARY)) AS 평균액
FROM EMPLOYEE
GROUP BY JOB;


--£ 직위별로(JOB) count(*) 함수를 이용하여 사원 수를 표시하세요.

SELECT JOB
,COUNT(*) FROM EMPLOYEE
GROUP BY JOB;


