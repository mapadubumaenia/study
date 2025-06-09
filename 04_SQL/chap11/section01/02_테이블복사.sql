--£ 테이블 복사하기(CTAS)
--① 예제) DEPARTMENT 테이블을 DEPT2 로 복사하세요
--단 CTAS 를 이용하세요


CREATE TABLE DEPT2
AS
SELECT * FROM DEPARTMENT;

--QUIZ
CREATE TABLE EMP2
AS
SELECT * FROM EMPLOYEE;



--£ 테이블 복사하기(CTAS) 2
--① 예제) DEPARTMENT 테이블을 DEPT3 로 복사하세요
--단 데이터는 제외하고 빈 테이블로 복사하세요
CREATE TABLE DEPT4
AS
SELECT * FROM DEPARTMENT
WHERE 1=2;             -- 거짓조건


--QUIZ
--② 퀴즈) EMPLOYEE 테이블을 EMP3 로 복사하세요
--단 데이터는 제외하고 빈 테이블로 복사하세요
CREATE TABLE EMP3
AS
SELECT * FROM EMPLOYEE
WHERE 1=2;   