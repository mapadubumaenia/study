--조건식과 OR 논리 연산자와 함께 사용하기
--① 예제) 부서 번호가(DNO) 10 이거나 또는 직급이(JOB) 'MANAGER' 인 사원만 출력하기
--사용법) SELECT 컬럼,...FROM 테이블
--       WHERE 컬럼='값';
--조건1) 부서 번호가(DNO) 10  이거나 또는(OR)
--조건2) 직급이(JOB) 'MANAGER'
-- OR 연산자 뜻: 조건1만 포함되고, 조건2만 포함되고, 동시에 포함될때도 OK



SELECT * FROM EMPLOYEE
WHERE DNO=10
OR JOB='MANAGER';