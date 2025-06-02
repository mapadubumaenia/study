--£ NULL 사용해서 조회하기
--① 예제) 상여금(COMMISSION) 이 NULL 인 사원을 조회


-- NULL 조회 예약어
--   사용법:  SELECT * FROM 테이블
--          WHERE 컬럼 IS NULL; 
--  오직 NULL만이 = 를 쓰지 않고 IS 를 써야한다.
SELECT * FROM EMPLOYEE
WHERE COMMISSION IS NULL;
