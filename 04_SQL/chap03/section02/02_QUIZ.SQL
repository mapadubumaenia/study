--① 퀴즈) 부서번호가(DNO) 10 이거나 20 인 사원들 화면에 표시하세요
--단, IN 예약어 사용하세요

SELECT * FROM EMPLOYEE
WHERE DNO IN (10,20);


--② 예제) 상여금(COMMISSION) 300 , 500 , 1400 이 모두 아닌 사원 조회하기
SELECT * FROM EMPLOYEE
WHERE COMMISSION NOT IN(300,500,1400);


--③ 예제) NULL 이상: 모든 값이 조회되지 않습니다. 
--상여금(COMMISSION) 300 , NULL 이 모두 아닌 사원 조회하기
SELECT * FROM EMPLOYEE
WHERE COMMISSION NOT IN (300,NULL);



--④ 퀴즈) 부서번호가(DNO) 10 이거나 20 이 아닌 사원들 화면에 표시하세요
--단, IN 예약어 사용하세요
SELECT * FROM EMPLOYEE
WHERE DNO NOT IN (10,20);