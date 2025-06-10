--£ 테이블에 디폴트 기능 및 CHECK 제약 조건 넣기
--① 예제) EMP3 SALARY 컬럼에 DEFAULT 기능을 추가하세요
--단, INSERT 시 컬럼이 생략될 경우 1000 이 입력되게 하세요

CREATE TABLE EMP3(
ENO NUMBER(4),
SALARY NUMBER(7,2) DEFAULT 1000
);
--SALARY 생략하면 값은 NULL이 뜬다 보통은
--디폴트(기본값) : 데이터 추가시 NULL일 경우 특정값으로 대체해서 추가함
INSERT INTO EMP3(ENO)
VALUES(8000);
COMMIT;


 
--2)CHECK 제약조건
CREATE TABLE EMP4(
ENO NUMBER(4),
SALARY NUMBER(7,2) CONSTRAINT CK_EMP4_SALARY CHECK(SALARY>0)
);

INSERT INTO EMP4(ENO,SALARY)
VALUES(8000,-200);-- X ORA-02290: 체크 제약조건(SCOTT.CK_EMP4_SALARY)이 위배되었습니다


--테이블 만든후 추가도 가능하지만 여백이 적어 적지않는다(실무에서 안씀)