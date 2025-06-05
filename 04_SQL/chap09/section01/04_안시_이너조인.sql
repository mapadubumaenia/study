-- 예제) 부서, 사원테이블을 부서번호로 조인해서 화면에 표시하세요
-- 부서 테이블명: DEPARTMENT
-- 사원 테이블명: EMPLOYEE
-- 부서번호    : DNO(공통컬럼)
-- 사원번호    : ENO
-- 사용법) SELECT E.*, D.*
--        FROM 테이블1 E
--           , 테이블2  D
--        WHERE E.공통컬럼=D.공통컬럼


-- 이너조인: 그냥 조인
SELECT E.*, D.*
FROM EMPLOYEE E
, DEPARTMENT  D
WHERE E.DNO=D.DNO;


-- ANSI 조인: 세계기구에서 SQL 통일을 위해 만듬
-- 안시조인 기본
-- 사용법: 
--  SELECT E.*, D.*
--  FROM 테이블1 E
--  INNER JOIN 테이블2  D
--  ON E.공통컬럼=D.공통컬럼;
SELECT  E.*, D.*
FROM EMPLOYEE E
INNER JOIN DEPARTMENT  D
ON E.DNO=D.DNO;

--SQLD 시험 대비
--안시조인 변형
--조건: 공통컬럼에 이름이 같으면 ON대신 USING 사용
--특징: DNO가 1개만 화면에 표시
SELECT  *
FROM EMPLOYEE 
INNER JOIN DEPARTMENT  
USING (DNO);


--안시조인 변형2
--조건: 공통컬럼에 이름이 같으면 ON대신 NETURAL JOIN 사용
SELECT  *
FROM EMPLOYEE 
NATURAL JOIN DEPARTMENT;


