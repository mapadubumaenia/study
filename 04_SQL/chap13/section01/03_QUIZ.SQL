--② 퀴즈) EMP2 테이블을 정의하고 DNO 에 참조키 제약조건을 만드세요
--제약이름은 FK_EMP2_DNO 로 만드세요
--단, EMP2 테이블은 ENO, DNO, ENAME 컬럼만 만드세요
--단, EMP2 테이블이 있으면 삭제하고 재생성해서 실습하세요


CREATE TABLE EMP2(
ENO	NUMBER(4,0),
ENAME VARCHAR2(10),
DNO	NUMBER(2,0)  CONSTRAINT FK_EMP2_DNO REFERENCES DEPARTMENT(DNO)
);

--SQLD 대비
--주의점: 1)부모테이블의 컬럼의 제약조건: 유일성(UNIQUE 또는 PK)보장이 되있어야 한다!
--       2)부모테이블의 데이터 삭제시 자식테이블의 참조키에 해당하는 데이터를 먼저 삭제해야 한다.
--   예) 부모: 부서번호(10~40) -> 자식:부서번호(40): 참조키되어있음
--     =>부모: 부서번호(40번 삭제) -> 자식: 부서번호(40) 먼저 삭제해야함

--(참고) FK(참조키) 만들기 2

CREATE TABLE EMP (
    ENO NUMBER(4,0),
    DNO NUMBER(2,0) ,
    ENAME VARCHAR2(10),
    CONSTRAINT FK_EMP_DNO FOREIGN KEY(DNO) REFERENCES DEPARTMENT(DNO)
);


-- (참고) FK(참조키) 만들기 3: 테이블 만든 후에 FK 추가하기
CREATE TABLE EMP(
ENO NUMBER(4,0),
    DNO NUMBER(2,0) ,
    ENAME VARCHAR2(10)
);

ALTER TABLE EMP
ADD CONSTRAINT FK_EMP_DNO FOREIGN KEY(DNO) REFERENCES DEPARTMENT(DNO);



