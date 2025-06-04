-- 가장 오래전에 입사한(HIREDATE) 사원(EMPLOYEE) 의 입사일을 화면에 표시하
-- 세요
-- 사원 테이블명: EMPLOYEE
-- 입사일      : HIREDATE
-- 사용법) SELECT SUM(컬럼), MAX(컬럼),ROUND(AVG(컬럼)),MIN(컬럼) FROM 테이블;
-- 주의점: 그룹함수 포함된 컬럼은 그룹함수끼리만 볼 수 있습니다.
--  예) SELECT ENAME, MIN(HIREDATE) AS 오래전 FROM EMPLOYEE; // 안됨(X)
SELECT MIN(HIREDATE) AS 오래전 FROM EMPLOYEE;