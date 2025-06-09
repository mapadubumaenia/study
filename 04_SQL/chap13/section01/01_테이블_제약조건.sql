--£ 테이블에 유일성 제약조건, NOT NULL 제약조건 넣기
--① 예제) DEPT 테이블을 정의하고 DNAME 컬럼에 UNIQUE 제약조건을 만드세요
--단, UK_DEPT_DNAME 이름으로 만드세요
--단, DNO 에는 NOT NULL 제약조건을 추가하세요



--(참고) 데이터 추가시 유일값만 추가되게 하는 제약조건:
CREATE TABLE DEPT(
DNO NUMBER(2,0) NOT NULL,
DNAME VARCHAR2(14) CONSTRAINT UK_DEPT_DNAME UNIQUE,
LOC VARCHAR2(13)
);



