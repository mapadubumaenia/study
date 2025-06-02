--② 퀴즈) 사원 테이블에서(EMPLOYEE) 사원명으로(ENAME) 오름차순 정렬하세요

SELECT * FROM EMPLOYEE
ORDER BY ENAME;


--③ 예제) 사원(EMPLOYEE) 테이블 내림차순 정렬하기
--단, 월급(SALARY)으로 정렬하세요

SELECT * FROM EMPLOYEE
ORDER BY SALARY DESC;

--④ 퀴즈) 사원 테이블에서(EMPLOYEE) 사원명으로(ENAME) 내림차순 정렬하세요
SELECT * FROM EMPLOYEE
ORDER BY ENAME DESC;

--⑤ 퀴즈) 사원테이블에서(EMPLOYEE) 급여는(SALARY) 내림차순으로 정렬하세요
--만약 급여가 같으면 사원명에 대해(ENAME) 추가로 오름차순으로 정렬하세요
SELECT * FROM EMPLOYEE
ORDER BY SALARY DESC;



