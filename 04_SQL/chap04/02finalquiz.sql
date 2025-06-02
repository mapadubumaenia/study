--£ 급여가(SALARY) 2000 을 넘는 사원의 이름과(ENAME) 급여를
--급여가 많은 것부터 작은 순으로 출력하세요(내림차순)

SELECT ENAME,SALARY FROM EMPLOYEE
WHERE SALARY > 2000
ORDER BY SALARY DESC;



--£ 사원번호가(ENO) 7788 인 사원의 이름과(ENAME)
--부서번호를(DNO) 표시하세요

SELECT ENAME,DNO FROM EMPLOYEE
WHERE ENO = 7788;




--£ 급여가(SALARY) 2000 에서 3000 사이에 포함되지 않는
--사원의 이름과(ENAME) 급여를 표시하세요.

SELECT ENAME,SALARY FROM EMPLOYEE
WHERE  SALARY NOT BETWEEN 2000 AND 3000;




--£ 1981 년 2 월 20 일 부터 1981 년 5 월 1 일 사이에 입사한 사원의
--이름(ENAME), 직위(JOB), 입사일(HIREDATE)을 표시하세요

SELECT ENAME,JOB,HIREDATE FROM EMPLOYEE
WHERE hiredate BETWEEN '81/02/20' AND '81/05/01';




