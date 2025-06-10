--② 퀴즈) DEPT2 테이블을 정의하고 DNO 에 기본키 제약조건을 만드세요
--제약이름은 PK_DEPT2 로 만드세요
--단, DEPT2 테이블이 있으면 삭제하고 재생성해서 실습하세요


CREATE TABLE DEPT2(
DNO NUMBER(2,0) CONSTRAINT PK_DEPT2 PRIMARY KEY,
DNAME VARCHAR2(14),
LOC VARCHAR2(13)
);

-- 데이터 추가 테스트 : NULL 넣기(DNO)
-- 사용법: INSERT INTO 테이블(컬럼,컬럼2,...)
--        VALUES(값,'값2',...);
INSERT INTO DEPT(DNO,DNAME,LOC)
VALUES(NULL,'개발부','부산');   --X   NULL을 넣을수 없음

INSERT INTO DEPT(DNO,DNAME,LOC)
VALUES(10,'개발부','부산');    --O

INSERT INTO DEPT(DNO,DNAME,LOC)
VALUES(10,'개발부2','대구');     --X   무결성 조항에 위반됩니다(중복데이터 넣을수 없음)

ROLLBACK;    --전부 취★소


-- SQLD 대비
-- (참고) 2번째 PK 제약조건 추가하기
-- 사용법
-- CREATE TABLE 테이블 (
--    컬럼 자료형(자리수),
--    DNAME VARCHAR2(14)...,
--    CONSTRAINT 제약조건명 PRIMARY KEY(컬럼)
-- );
CREATE TABLE DEPT (
    DNO NUMBER(2,0),
    DNAME VARCHAR2(14),
    LOC  VARCHAR2(13),
    CONSTRAINT PK_DEPT PRIMARY KEY(DNO)
);
-- (참고) 3번째 PK 제약조건 추가하기: 테이블 만들고 난 후에 PK 추가하기
-- 사용법
CREATE TABLE DEPT (
    DNO NUMBER(2,0),
    DNAME VARCHAR2(14),
    LOC  VARCHAR2(13)
);
ALTER TABLE DEPT
ADD CONSTRAINT PK_DEPT PRIMARY KEY(DNO);


--복합키: 컬럼 2개이상을 동시에 PK로 추가하는 것을 의미
-- 예) 주문(쇼핑몰): 고객이 (몇개의)상품명을 주문합니다. 
--               A,B 고객 지우개 상품을 주문할 수도 있습니다.
--                홍길동     지우개
--                홍길동      연필
--   복합키: PRIMARY KEY(NAME,PRODUCT);
--    추천) 프로젝트 할때는 복합키를 안쓰는게 좋음, 복잡함
--    테이블에는 PK가 1개가 있어야 함(중복방지)