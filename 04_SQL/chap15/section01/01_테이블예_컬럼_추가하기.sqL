--£ 테이블에 컬럼 추가하기
--① 예제) DEPARTMENT 테이블 복사하여 DEPT_SAMPLE 빈 테이블을 만드세요
--테이블의 컬럼을 변경하세요


CREATE TABLE DEPT_SAMPLE
AS
SELECT * FROM DEPARTMENT
WHERE 1=2;

--테이블 만든 이후 컬럼 추가
--사용법) ALTER TABLE 테이블
--       ADD(추가컬럼 자료형(자리수));
ALTER TABLE DEPT_SAMPLE
ADD(BIRTH DATE);