--② 퀴즈) DEPT 테이블에 데이터를 추가하세요

INSERT INTO DEPT(DNO,DNAME,LOC)
       VALUES(20,'개발부','부산');
       
       COMMIT;
       
-- SQLD 대비 :
-- SAVEPOINT : 예약어
INSERT INTO DEPT(DNO,DNAME,LOC)
VALUES(20,'회계부2','뉴욕');

SAVEPOINT A;

INSERT INTO DEPT(DNO,DNAME,LOC)
VALUES(30,'회계부3','뉴욕');

SELECT * FROM DEPT;

-- 아이구 잘못 추가했네: 개발자
-- 취소 : 회계부3 만 취소하기
-- 사용법: ROLLBACK TO SAVEPOINT 이름;
ROLLBACK TO SAVEPOINT A;

-- 전체 취소
SELECT * FROM DEPT;

