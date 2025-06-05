--£ Exists 서브 쿼리 사용하기
--① 예제) Sales 부서에 속한 직원들을 이름을 표시하세요



--1) SALES 부서의 부서번호: 30
SELECT DNO FROM DEPARTMENT
WHERE DNAME ='SALES';


--2) 그 부서번호에 속한 직원들  => 일반 서브쿼리로 구하기
SELECT ENAME FROM EMPLOYEE
WHERE DNO IN(SELECT DNO FROM DEPARTMENT
WHERE DNAME ='SALES');


-- SQLD 대비
-- Exists 사용: 속도 향상
-- 사용법: SELECT 컬럼 FROM 테이블 E
--        WHERE EXISTS (SELECT 1 FROM 테이블2 D
--                      WHERE D.공통컬럼=E.공통컬럼
--                      AND 컬럼2='값');

SELECT ENAME FROM EMPLOYEE E
WHERE EXISTS (SELECT 1 FROM DEPARTMENT D
WHERE E.DNO= D.DNO
AND DNAME ='SALES');