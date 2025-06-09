--£ 테이블 만들기
--① 예제) DEPT 테이블을 만드세요. 단, DEPARTMENT 테이블 컬럼 정보를 확인하고 똑같이 만드세요

CREATE TABLE DEPT(
DNO NUMBER(2),
DNAME VARCHAR2(14),
LOC VARCHAR2(13)
);


--사용법 CREATE TABLE 
--  컬럼 1  자료형(자리수)
--  컬럼 2  자료형(자리수)
--
--자료형: 숫자(NUMBER), 글자(VARCHAR2)(추천하는 자료형), 글자(CHAR)
--SQLD 대비: VARCHAR2(자리수만큼 크기가 작으면 자동으로 공간이 줄어듬) VS  CHAR(고정크기
--숫자자료형 특징: 자리수 생햑하면 정수든,실수든 무한히 들어감
--(참고) 글자자료형 특징: 자리수 생략하면 무조건 1개
-- (참고)날짜 형태 : 글자(날짜 연산이 없다)/날짜자료형(날짜 연산이 많다)

CREATE TABLE EMP(
ENO	NUMBER(4,0),
ENAME	VARCHAR2(10 BYTE),
JOB	VARCHAR2(9 BYTE),
MANAGER	NUMBER(4,0),
HIREDATE	DATE,
SALARY	NUMBER(7,2),
COMMISSION	NUMBER(7,2),
DNO	NUMBER(2,0)
);