--② 퀴즈) 사원테이블에서 사원명을 대문자, 소문자, 첫 글자만 대문자로 바꾸어보세요

SELECT UPPER(ENAME)
,LOWER(ENAME)
,INITCAP(ENAME)
FROM EMPLOYEE;