--퀴즈) 사원테이블(EMPLOYEE)에 MANAGER(관리자) 컬럼이 있습니다.
--관리자가(MANAGER) NULL 인 사원을 표시하세요

SELECT * FROM EMPLOYEE
WHERE MANAGER IS NULL; 



--③ 예제) 상여금(COMMISSION) 이 NULL 이 아닌 사람 조회하세요
SELECT * FROM EMPLOYEE
WHERE COMMISSION IS NOT NULL;

