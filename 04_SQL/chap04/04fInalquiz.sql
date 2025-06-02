--£ COMMISSION(상여금)을 받을 수 있는 자격이 되는
--사원의 이름(ENAME), 급여(SALARY), 상여금(COMMISSION)을 표시하되
--급여 및 상여금을 기준으로 내림차순 정렬하여 출력하세요

SELECT ENAME,SALARY,COMMISSION FROM EMPLOYEE
WHERE COMMISSION IS NOT NULL
ORDER BY SALARY DESC, COMMISSION DESC;





--£ 이름(ENAME)이 S 로 시작하는 사원의 이름을 표시하세요.

SELECT ENAME FROM EMPLOYEE
WHERE ENAME LIKE 'S%';





--£ 이름에(ENAME) A 와(1 번조건) E 를(2 번조건) 모두 포함하고 있는 사원의 이름을
--표시하세요.

SELECT ENAME FROM EMPLOYEE
WHERE ENAME LIKE '%A%'
AND ENAME LIKE '%E%';





--£ 담당업무(JOB)가 사무원(CLERK) 또는 영업사원(SALESMAN)이면서
--급여가 $1600, $950 또는 $1300 이 아닌
--사원의 이름(ENAME), 직위(JOB), 급여(SALARY)를 표시하세요

SELECT ENAME,JOB,SALARY FROM EMPLOYEE
WHERE JOB IN('SALESMAN','CLERK')
AND SALARY NOT IN (1300,950,1600);

