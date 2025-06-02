-- ① 예제) 사원(EMPLOYEE) 테이블 오름차순 정렬하기
--단, 월급(SALARY)으로 정렬하세요 
--  오름차순: ASCENFING (생략가능) => 디폴트가 오름차순이기 때문
--  내림차순: DESCENDING

--사용법) SELECT * FROM 테이블
--       ORDER BY 컬럼 ASC;
 

SELECT * FROM EMPLOYEE
ORDER BY SALARY ASC;