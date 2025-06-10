--테이블에 참조키(FOREIGN KEY) 제약조건 넣기
--① 예제) EMP 테이블을 정의하고 DNO 에 참조키 제약조건을 만드세요
--제약이름은 FK_EMP_DNO 로 만드세요
--단, EMP 테이블은 ENO, DNO, ENAME 컬럼만 만드세요
--단, EMP 테이블이 있으면 삭제하고 재생성해서 실습하세요

--참조키: 부모테이블(DEPARTMENT)의 컬럼<-> 자식테이블의 컬럼 (연결:DNO)
-- 설명: 예) 부서: 부서(개발부, 운영부, 연구소, 판매부) <- 직원은 모든 부서중에 1개에 소속되어야 합니다.
--           => 만약 소속되지 않는 사원이 있으면 ? 쓰레기 데이터(오류)
-- 참조키 원리 : 부모테이블에 부서정보에 해당하는 데이터 있는 지 확인: 10 ~ 40
--              만약 10 ~ 40 이외의 데이터기 추가하려고 하면 에러를 발생시킵니다.

--사용법: CREATE TABLE 테이블(      
--          컬럼3 자료형  CONSTRAINT 제약조건명 REFERENCES 부모테이블(부모컬럼));              
--)


CREATE TABLE EMP(
ENO	NUMBER(4,0),
ENAME VARCHAR2(10),
DNO	NUMBER(2,0)  CONSTRAINT FK_EMP_DNO REFERENCES DEPARTMENT(DNO)
);
