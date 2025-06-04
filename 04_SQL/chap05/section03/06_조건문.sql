--£ SQL 조건문 사용하기
--① 예제) 부서 번호가 10 이면 ‘회계부’,
--20 이면 ‘연구소’,
--30 이면 ‘판매부’,
--40 이면 ‘운영부’,
--모두 아니면 ‘디폴트’로 바꾸어서 조회하세요

-- 사용법) SELECT DECODE(컬럼,값,'결과표시1'
--                 ,값2,'결과표시2'
--                  ...
--                 ,'디폴트표시') AS 부서명
--       FROM 테이블
-- 

SELECT DNO
,DECODE(DNO,10,'회계부'
,20,'연구소'
,30,'판매부'
,40,'운영부'
,'디폴트') AS부서명
FROM EMPLOYEE;


--하나더

SELECT DNO
 ,CASE WHEN DNO =10 THEN '회계부'
  WHEN DNO =20 THEN '연구소'
  WHEN DNO =30 THEN '판매부'
  WHEN DNO =40 THEN '운영부'
  ELSE '디폴트'
  END       AS부서명
  FROM EMPLOYEE;
