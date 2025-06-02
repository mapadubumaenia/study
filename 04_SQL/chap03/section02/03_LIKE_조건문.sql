--£ LIKE 사용해서 조회하기
--① 예제) 이름이(ENAME) 'F' 로 시작하는 사원 조회하기
-- %: 아무 글자나 올 수 있음
--  사용법:  SELECT * FROM EMPLOYEE
--          WHERE 컬럼 LIKE '%글자%';     

SELECT * FROM EMPLOYEE
WHERE ENAME LIKE 'F%';


