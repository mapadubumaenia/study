--£ 테이블에 데이터 추가하기
--① 예제) DEPT 테이블에 데이터를 추가하세요
--단, 실습을 위해 DEPARTMENT, EMPLOYEE 테이블을 빈테이블만 복사해서 사용하세
--요. 만약 DEPT, EMP 테이블이 있다면 삭제하고 다시 만드세요


CREATE TABLE DEPT
AS
SELECT * FROM DEPARTMENT
WHERE 1=2;               --빈 데이터를 가진 DEPT 만들기

CREATE TABLE EMP
AS
SELECT * FROM EMPLOYEE
WHERE 1=2;               --빈 데이터를 가진 EMP 만들기


--  사용법: INSERT INTO 테이블(컬럼,컬럼2...)
--         VALUES(값,값2....);
--부서 DEPT 추가: 
INSERT INTO DEPT(DNO,DNAME,LOC)
VALUES(10,'회계부','뉴욕');

--마지막에 반드시 취소/확정 2개중에 1개를 실행해야함

-- 취소하고 싶은 경우:
ROLLBACK;

--확정!
COMMIT;



