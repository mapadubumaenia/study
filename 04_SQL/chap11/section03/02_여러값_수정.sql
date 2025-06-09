--£ 테이블에 여러 데이터 수정하기
--① 예제) DEPT 테이블에 여러 데이터를 수정하세요
--단, 10 번 부서의 부서명을 PROGRAMMING2 로 부서 위치를 SEOUL 로 수정하세요

--사용법
--UPDATE 테이블
--SET
--컬럼1 ='값’
--,칼럼2 ='값’
--...
--WHERE 컬럼 =값;
--COMMIT;


UPDATE DEPT
SET
DNAME='PROGRAMMING2', LOC='SEOUL'
WHERE DNO=10;
COMMIT;
SELECT * FROM DEPT;