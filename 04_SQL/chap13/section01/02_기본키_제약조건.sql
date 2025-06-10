--£ 테이블에 기본키(PRIMARY KEY) 제약조건 넣기
--① 예제) DEPT 테이블을 정의하고 DNO 에 기본키 제약조건을 만드세요
--제약이름은 PK_DEPT 로 만드세요
--단, DEPT 테이블이 있으면 삭제하고 재생성해서 실습하세요

CREATE TABLE DEPT
AS
SELECT * FROM DEPARTMENT;
-- 테이블 복사를 할경우 제약조건, 주석등은 복사되지 않는다.

DROP TABLE DEPT; -- 일단 한번삭제

CREATE TABLE DEPT(
DNO NUMBER(2,0) CONSTRAINT PK_DEPT PRIMARY KEY,
DNAME VARCHAR2(14),
LOC VARCHAR2(13)
);
 

--PRIMARY KEY : 1) NOT NULL 제약조건을 기본적으로 추가!
--              2) UNIQUE 제약조건도 기본적으로 추가!
--              3) 값이 무조건 들어가고,중복이 없게 만드는 제약조건
-- 사용법) CREATE TABLE DEPT (
--         컬럼 자료형(자리수) CONSTRAINT 제약조건명 PRIMARY KEY,
--(장점) 테이블의 데이터 중복을 방지(데이터 무결성을 보장해줌)








