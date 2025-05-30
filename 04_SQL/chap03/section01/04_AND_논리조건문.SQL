-- 조건식과 AND 논리 연산자와 함께 사용하기
--① 예제) 부서 번호(DNO) 가 10 이고 직급이(JOB) 'MANAGER' 사원을 출력하세요
--사용법) SELECT 컬럼,...FROM 테이블
--       WHERE 컬럼='값';
--사원테이블:EMPLOYEE
--부서번호 :DNO
--직급:JOB
SELECT * FROM EMPLOYEE
WHERE DNO=10 AND JOB='MANAGER';