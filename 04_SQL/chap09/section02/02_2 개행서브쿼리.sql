-- 예제) 부서별 최소 급여를 받는 사원 중에서 이름을 화면에 표시하세요
-- 사원 테이블명: EMPLOYEE
-- 사원명      : ENAME
-- 월급        : SALARY
-- 부서번호     : DNO
-- 사용법: SELECT * FROM 테이블1
--        WHERE 컬럼2 > (SELECT 컬럼2 FROM 테이블2
--                        WHERE 컬럼 = '값');


-- 1)부서별 최소 급여: 800,950,1300
SELECT MIN(SALARY) FROM EMPLOYEE
GROUP BY DNO;


--2) 800,950,1300 을 받는 사원

SELECT * FROM EMPLOYEE
WHERE SALARY IN (800,950,1300);


--2) 800,950,1300 을 받는 사원
-- 사용법) SELECT * FROM 테이블2
--        WHERE 컬럼 IN (SELECT MIN(컬럼) FROM 테이블1
--                         GROUP BY 컬럼2);
-- 주의점) >(부등호) 대신 IN 사용: 다중행 서브쿼리
SELECT * FROM EMPLOYEE
WHERE SALARY IN (SELECT MIN(SALARY) FROM EMPLOYEE
                GROUP BY DNO);
