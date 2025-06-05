--£ 아우터 조인하기
--① 예제) DNO 를 공통 컬럼으로 왼쪽 아우터 조인해서 화면에 표시하세요

-- 부서 테이블명: DEPARTMENT
-- 사원 테이블명: EMPLOYEE
-- 부서번호    : DNO(공통컬럼)
-- 사원번호    : ENO

--아우터 사용법)
-- SELECT E.*, D.*
-- FROM 테이블1 E
--   , 테이블2  D
-- WHERE E.공통컬럼 (+) =D.공통컬럼
--해석) E.공통컬럼 테이블은 데이터가 없음(없는쪽에 +붙임)
--      반대 테이블은 모든 데이터가 나옴

-- (참고) WHERE E.공통컬럼(+)=D.공통컬럼 : 용어) RIGHT OUTER 조인
--       WHERE E.공통컬럼=D.공통컬럼(+) : 용어) LEFT OUTER 조인


--부서데이터: DNO (부서번호:10~40)
--사원데이터: DNO (부서번호:10~30)

SELECT E.DNO  AS 사원DNO
,D.DNO       AS 부서DNO   
FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO (+) = D.DNO;