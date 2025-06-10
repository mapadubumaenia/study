--£ 데이터 추가 시에 시퀀스 사용하기
--① 예제) 테이블에 insert 할때 시퀀스 사용하기
--단, DEPARTMENT 테이블을 복사하여 DEPT 빈 테이블을 만드세요(CTAS) 


-- 시퀀스 실행 사용법: 시퀀스명.NEXTVAL
-- 실행할때 마다 숫자가 증가함
INSERT INTO DEPT(DNO, DNAME, LOC)
VALUES(SAMPLE_SEQ.NEXTVAL, '영업부','부산');

--참고) 현재 시퀀스의 증가값을 보기
-- 사용법: 시퀀스명.CURRVAL
SELECT SAMPLE_SEQ.CURRVAL FROM DUAL;

COMMIT;