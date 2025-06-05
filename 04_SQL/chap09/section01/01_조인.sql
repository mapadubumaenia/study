--£ 조인하기
--① 예제) 사원번호가(ENO) 7788 인 사원의 부서명은(DNAME) 뭘까요?

SELECT * FROM EMPLOYEE
WHERE ENO = 7788;

SELECT * FROM DEPARTMENT
WHERE DNO = 20;    -- DNAME 찾음! RESERCH! BUT 식을 2번이나써야함 통신2번 =>느림


--조인: 컬럼 합치기
--
SELECT EMPLOYEE.*, DEPARTMENT.*
FROM EMPLOYEE
,DEPARTMENT
WHERE EMPLOYEE.DNO = DEPARTMENT.DNO --DNO로 등호를 안해도 조인이되지만 조회속도가 느려진다!
AND EMPLOYEE.ENO=7788;


--등호조인 X  => 부서4개  사원14개 ==> 총56번의 조회를 해버린다.(처리량 증가) ㅠㅠ
SELECT EMPLOYEE.*, DEPARTMENT.*
FROM EMPLOYEE
,DEPARTMENT;

-- 테이블 별명+이퀄(=)조인 사용법: 
-- SELECT E.*, D.*
-- FROM 테이블1 E
--   , 테이블2  D
-- WHERE E.공통컬럼=D.공통컬럼


SELECT E.*, D.*
FROM EMPLOYEE  E
,DEPARTMENT  D
WHERE E.DNO = D.DNO
AND E.ENO=7788;