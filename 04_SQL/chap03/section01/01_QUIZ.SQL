--② 퀴즈) 부서테이블에서 DNO(부서번호) 가 20 보다 큰 부서만 표시하세요
SELECT DNO,DNAME,LOC FROM DEPARTMENT
WHERE DNO >20;


--③ 퀴즈) 사원 테이블에서 DNO(부서번호) 10 인 사원을 찾아 전체 출력하세요
SELECT * FROM EMPLOYEE
WHERE DNO=10;


--④ 퀴즈) 사원테이블에서 월급이 5000 인 사람의 이름을 출력하세요
SELECT ENAME FROM EMPLOYEE
WHERE SALARY=5000;