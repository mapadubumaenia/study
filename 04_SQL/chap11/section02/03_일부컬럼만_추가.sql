-- 테이블에 NULL을 넣어서 추가하기
-- ①예제) DEPT 테이블에 아래와 같이 NULL값을 넣어서 추가하세요
-- 사용법: INSERT INTO 테이블(컬럼,컬럼2,...)
--        VALUES(값,'값2',...);
--DNO
--DNAME
--LOC
-- (참고) 명시적으로 넣기
INSERT INTO DEPT(DNO,DNAME,LOC)
VALUES(40,'영업부',NULL);

-- (참고) 생략해서 NULL 넣기
INSERT INTO DEPT(DNO,DNAME)
VALUES(50,'영업부2');

-- (참고) 생략해서 편하게 쓰기, 무조건 전체컬럼에 대해 데이터 추가합니다.
-- 사용법: INSERT INTO 테이블
--        VALUES(값1,'값2',...);
INSERT INTO DEPT
VALUES(60,'영업부3','부산');

COMMIT;
