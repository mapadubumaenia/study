--£ 사원 테이블에서 JOB 이(직위) 'MANAGER' 인 사원의 데이터를 뽑아서
--ENAME(사원명)으로 오름차순 정렬하세요

SELECT * FROM EMPLOYEE
WHERE JOB = 'MANAGER'
ORDER BY ENAME;





--£ 사원테이블에서 JOB 이 'CLERK' 인 사원의 데이터를 뽑아서
--ENAME(사원명)으로 내림차순 정렬하세요

SELECT * FROM EMPLOYEE
WHERE JOB = 'CLERK'
ORDER BY ENAME DESC;




--£ 덧셈 연산자를 이용하여 모든 사원에 대해서 300 의 급여 인상을
--계산 후 사원의 이름(ENAME), 급여(SALARY), "인상된 급여"(별명)를 표시하세요

SELECT ENAME, SALARY +300 AS 인상된급여 FROM EMPLOYEE;




--사원의 이름(ENAME), 급여(SALARY), 연간 총수입을
--총수입이 많은 것부터 작은 순으로 표시하세요

SELECT ENAME,SALARY, SALARY * 12 +100  AS 연간총수입 FROM EMPLOYEE
ORDER BY  연간총수입 DESC;







