-- 예제) SAMPLE_SEQ 시퀀스를 1부터 시작해서 10씩 증가시키는 시퀀스 생성하세요
-- 시퀀스 만들기
-- 사용법) CREATE SEQUENCE 시퀀스이름
--        INCREMENT BY 증가값
--        START WITH 시작값
--        MINVALUE 최소값 (생략가능)
--        MAXVALUE 최대값 (생략가능)
CREATE SEQUENCE SAMPLE_SEQ
INCREMENT BY 10
START WITH 1;

-- 시퀀스 실행
SELECT SAMPLE_SEQ.NEXTVAL FROM DUAL;

-- 시퀀스 실행 사용법: 시퀀스명.NEXTVAL
-- 실행할때 마다 숫자가 증가함
INSERT INTO DEPT(DNO, DNAME, LOC)
VALUES(SAMPLE_SEQ.NEXTVAL, '영업부','부산');

--참고) 현재 시퀀스의 증가값을 보기
-- 사용법: 시퀀스명.CURRVAL
SELECT SAMPLE_SEQ.CURRVAL FROM DUAL;

COMMIT;

