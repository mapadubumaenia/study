--£ 조인하기에 조건 붙이기
--① 예제) 사원 번호가(ENO) 7499 또는 7900 인 사원들에 소속된 부서 정보를 모두 화면에 표
--시하세요

-- 부서 테이블명: DEPARTMENT
-- 사원 테이블명: EMPLOYEE
-- 부서번호    : DNO
-- 사원번호    : ENO
-- SELECT E.*, D.*
-- FROM 테이블1 E
--   , 테이블2  D
-- WHERE E.공통컬럼=D.공통컬럼


SELECT D.*,E.*
FROM EMPLOYEE E
,DEPARTMENT D
WHERE D.DNO = E.DNO
AND E.ENO IN (7499,7900);

-- 조회속도(최대:3초이내)
-- (참고) SQL(쿼리) 의 실행순서: 1) FROM 테이블 2) WHERE 조건 3) GROUP BY 그룹 
--4) HAVING 조건 5) SELECT 화면표시 6) ORDER BY 정렬



