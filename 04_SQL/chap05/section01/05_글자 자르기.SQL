--예제) 부서테이블에서 부서명의 첫글자부터 1개만 잘라서 화면에 표시하세요.
-- 부서테이블: DEPARTMENT
-- 부서명   : DNAME
--SQL 첫글자 위치: 1부터 시작

--사용법)       SELECT SUBSTR(컬럼,시작위치,자를갯수)
--             FROM 테이블;
--(참고) 글자 뒤에서 부터 자르기(SQLD 대비)
-- 시작위치 : 음수(뒤에서 시작함)


SELECT DNAME,
SUBSTR (DNAME,1,1)
FROM DEPARTMENT