--② 퀴즈) 사원 테이블에서 직위(JOB)별 급여(SALARY) 총액(SUM)이 5000 이상인 직위와
--급여총액을 화면에 표시하세요



SELECT JOB
,SUM(SALARY) AS 급여총액
FROM EMPLOYEE
GROUP BY JOB
HAVING SUM(SALARY)>=5000;