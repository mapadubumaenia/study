--£ 테이블에 데이터 복사해서 추가하기
--① 예제) DEPT 테이블에 데이터를 추가하세요
--단, DEPARTMENT 테이블의 데이터를 복사해서 사용하세요.
-- 사용법) INSERT INTO 테이블
--        SELECT * FROM 원본테이블;

INSERT INTO DEPT 
SELECT * FROM DEPARTMENT;

--취소/확정
COMMIT;

SELECT * FROM DEPT;