--날짜 글자를 비교연산자로 조회하기
--① 예제) 입사일(HIREDATE) 이 '1981/01/01' 이전인(이하) 사원만 표시하세요
--사용법) SELECT 컬럼,...FROM 테이블
--       WHERE 컬럼='값';
--  입사일: HIREDATE
--  전체컬럼: *
--  조건: 입사일이 '1981/01/01' 이전인 사람
--  (참고) : DB의 자료형: 글자(VARCHAR2), 숫자(NUMBER), 날짜(DATE)
--    입사일(DATE 자료형)
SELECT * FROM EMPLOYEE
WHERE HIREDATE <='81/01/01';