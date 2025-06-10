-- 테이블에 유일성 제약조건, NOT NULL 제약조건 넣기
-- ①예제) DEPT 테이블을 정의하고 DNAME 컬럼에 UNIQUE 제약조건을 만드세요
-- 단, UK_DEPT_DNAME이름으로 만드세요
-- 단, DNO에는 NOT NULL 제약조건을 추가하세요
-- 왜? 조회 서비스 : 어떤 조건에 해당하는 행을 가져오세요(유일한 행을 가져오기 위함)
-- 사용법) CREATE TABLE 테이블 (
--    컬럼1 숫자자료형(정수자리수,소수점자리수) NOT NULL,
--    컬럼2 글자자료형(자리수)               CONSTRAINT 제약조건이름 UNIQUE,
--    ...
--);
-- NOT NULL 제약조건
CREATE TABLE DEPT (
    DNO NUMBER(2,0) NOT NULL,
    DNAME VARCHAR2(14),
    LOC VARCHAR2(13)
);
-- (참고) 데이터 추가시 유일값만 추가되게 하는 제약조건: 
CREATE TABLE DEPT2 (
    DNO NUMBER(2,0) ,
    DNAME VARCHAR2(14) CONSTRAINT UK_DEPT_DNAME UNIQUE,
    LOC VARCHAR2(13)
);

-- SQLD 대비
-- (참고) 테이블 만들기 이후에 제약조건 추가하기
-- 사용법) ALTER TABLE 테이블
--        ADD CONSTRAINT 제약조건이름 UNIQUE(컬럼);
-- 주의점: 테이블명, 제약조건명은 이름이 유일해야함
-- 제약조건 추가: UNIQUE
ALTER TABLE DEPT
ADD CONSTRAINT UK_DEPT_DNAME UNIQUE(DNAME);

-- 제약조건 수정: NOT NULL(DNO 컬럼)
-- 사용법)
ALTER TABLE DEPT
MODIFY DNO NUMBER(2,0) NOT NULL;

