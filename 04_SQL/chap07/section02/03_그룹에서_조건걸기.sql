-- 예제) 부서 번호별(DNO) 최고 급여가(SALARY) 3000 이상인 부서의 부서 번호와 최고급
-- 여를 화면에 표시하세요.
-- 사원 테이블명:EMPLOYEE
-- 부서번호: DNO
-- 월급    : SALARY
-- 사용법) SELECT 컬럼1,MAX(컬럼2) FROM 테이블
--        GROUP BY 컬럼1;
--        HAVING MAX(컬럼2) >= 값;
-- 복잡한것은 쪼개서 생각하기
-- 그룹1 : 부서 번호별(DNO)


SELECT DNO,MAX(SALARY) FROM EMPLOYEE
GROUP BY DNO
HAVING MAX(SALARY) >= 3000;