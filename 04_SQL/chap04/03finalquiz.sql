--£ 부서번호(DNO)가 20 및 30 에 속한 (이거나,또는 OR, IN)
--사원의 이름(ENAME)과 부서번호(DNO)를 출력하되
--이름을 기준으로 내림차순 출력하세요(정렬)

SELECT ENAME,DNO FROM EMPLOYEE
WHERE DNO IN(20,30)
ORDER BY ENAME DESC;




--£ 사원의 급여(SALARY)가 2000 에서 3000 사이에 포함되고
--부서번호(DNO)가 20 또는 30 인
--사원의 이름(ENAME), 급여와(SALARY) 부서번호를(DNO) 출력하되
--이름순(오름차순)으로 표시하세요

SELECT ENAME,SALARY,DNO FROM EMPLOYEE
WHERE SALARY BETWEEN 2000 AND 3000
AND DNO IN(20,30)
ORDER BY ENAME;




--£ 1981 년도에 입사한 사원의 이름(ENAME)과 입사일(HIREDATE)을 표시하세요
--단, LIKE 연산자와 와일드카드(%)를 사용하세요

SELECT ENAME,HIREDATE FROM EMPLOYEE
WHERE HIREDATE LIKE '81%';





--£ 관리자가(MANAGER) 없는 사원의 이름(ENAME)과 직위를(JOB) 표시하세요

SELECT ENAME,JOB FROM EMPLOYEE
WHERE MANAGER IS NULL;