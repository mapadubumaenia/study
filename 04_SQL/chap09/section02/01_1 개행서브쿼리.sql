--£ 단일 행 서브 쿼리 사용하기

-- 예제) SCOTT 사원보다 급여를(SALARY) 많이 받는 사원이 누구인지 화면에 표시하세요
-- 사원 테이블명: EMPLOYEE
-- 사원명      : ENAME
-- 월급        : SALARY
-- 사용법) SELECT * FROM 테이블
--        WHERE 컬럼 >= 값;

--서브쿼리: 왜?
--조건 : SCOTT 사원 급여?
SELECT SALARY FROM EMPLOYEE
WHERE ENAME = 'SCOTT';

SELECT * FROM EMPLOYEE
WHERE SALARY > 3000; -- KING 사원



--문제점: SQL(쿼리)를 2번 실행: 오래걸림(비추천)
--개선: 1)서브쿼리: 1번실행 
-- 주의점) 비교하는 컬럼이 일치해야 한다!(갯수도 맞아야한다)
SELECT * FROM EMPLOYEE
WHERE SALARY > (SELECT SALARY FROM EMPLOYEE
                  WHERE ENAME = 'SCOTT');

