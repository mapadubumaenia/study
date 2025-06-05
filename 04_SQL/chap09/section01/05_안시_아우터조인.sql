--£ 안시 아우터 조인하기

-- 예제) 부서, 사원테이블을 부서번호로 왼쪽 아우터 조인해서 화면에 표시하세요
-- 부서 테이블명: DEPARTMENT
-- 사원 테이블명: EMPLOYEE
-- 부서번호    : DNO(공통컬럼)
-- 사원번호    : ENO

-- 사용법) SELECT E.*, D.*
--        FROM 테이블1 E
--           , 테이블2  D
--        WHERE E.공통컬럼(+)=D.공통컬럼


-- RIGHT 아우터 조인
SELECT E.DNO, D.DNO
FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO(+)=D.DNO;


--안시 RIGHT 아우터 조인
--사용법: 
--  SELECT E.DNO, D.DNO
--  FROM 테이블1 E
--  RIGHT OUTER JOIN 테이블2  D
--  ON E.공통컬럼=D.공통컬럼;
SELECT E.DNO, D.DNO
FROM EMPLOYEE E
RIGHT OUTER JOIN DEPARTMENT D
ON E.DNO=D.DNO;

--안시 LEFT 아우터 조인
SELECT D.DNO, E.DNO
FROM DEPARTMENT D
LEFT OUTER JOIN EMPLOYEE E
ON D.DNO=E.DNO;

--안시 FULL OUTER 조인 : 오라클(+) 안됨 쓸거면 안시를 써야함
-- 1)=(일치)한 데이터가 먼저 나옴
-- 2) 일치하지 않는 데이터는 아래에 붙임
SELECT D.DNO, E.DNO
FROM DEPARTMENT D
FULL OUTER JOIN EMPLOYEE E
ON D.DNO=E.DNO;