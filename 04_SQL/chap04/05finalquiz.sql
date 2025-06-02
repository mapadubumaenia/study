--£ COMMISSION(상여금)이 $500 이상인 사원의 이름(ENAME)과 급여(SALARY)
--및 COMMISSION(상여금)을 표시하세요

SELECT ENAME,SALARY,COMMISSION FROM EMPLOYEE
WHERE COMMISSION >=500;




--£ 사원테이블에서(EMPLOYEE) 사원 이름이(ENAME) S 로 끝나는 사원 데이터를
--모두 표시하는 SQL 문을 작성해 보세요

SELECT * FROM EMPLOYEE
WHERE ENAME LIKE '%S';




--£ 사원 테이블을(EMPLOYEE)에서 30 번 부서에서(DNO) 근무하는 사원 중에
--직위가(JOB) SALESMAN 인 사원의 사원번호(ENO), 이름(ENAME),
--직책(JOB), 급여(SALARY), 부서번호를(DNO) 표시하세요

SELECT ENO,ENAME,JOB,SALARY,DNO FROM EMPLOYEE
WHERE DNO =30
AND JOB = 'SALESMAN';




--£ 사원 테이블을(EMPLOYEE)에 20 번, 30 번 부서에(DNO) 근무하는 사원 중
--급여가(SALARY) 2000 초과인 사원을 조회하세요

SELECT * FROM EMPLOYEE
WHERE DNO IN(20,30)
AND SALARY > 2000;




