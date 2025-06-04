-- 예제) 사원테이블의 월급을 글자로 바꾸세요
-- ‘L999,999’의 숫자 포맷으로 화면에 표시하세요
-- 사원 테이블명: EMPLOYEE
-- 월급         : SALARY
-- 사용법) SELECT * FROM 테이블;
-- 통화기호: W(원화표시,자동(DB설치시 결정(한국))
-- 함수들은 화면에 표시될때만 바뀜(DB 데이트는 그대로 있음)
SELECT TO_CHAR(SALARY,'L999,999'),
      TO_CHAR(SALARY,'L000,000')
FROM EMPLOYEE;