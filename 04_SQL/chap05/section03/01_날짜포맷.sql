--£ 날짜를 글자로 바꾸기
--① 예제) 사원테이블의 입사일을 글자로 바꾸세요
--‘YYYY-MM-DD HH24:MI:SS’의 날짜로 화면에 표시하세요
--SQL은 대소문자 구분 안함
--사용법) SELECT TO_CHAR(컬럼,'YYYY--MM--DD HH24:MI:SS') FROM 테이블;
--  YYYY(년도(YEAR, 4자리)), YY(년도(2자리))
--  MM(월(MONTH, 2자리))
--  DD(일(DAY, 2자리))
--  HH(시(HOUR, 1~12까지 시간, 2자리))
--  HH24(시(HOUR, 1~24까지 시간, 2자리))
--  MI(분(MINUTE, 2자리))
--  SS(초(SECOND, 2자리))
 

SELECT TO_CHAR(HIREDATE,'YYYY-MM--DD HH24:MI:SS')
FROM EMPLOYEE;