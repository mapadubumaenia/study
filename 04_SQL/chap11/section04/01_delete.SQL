--£ 테이블에 데이터 삭제하기
--① 예제) DEPT 테이블에 데이터를 삭제하세요
--단, 10 번 부서 삭제하세요

DELETE FROM DEPT
WHERE DNO =10;
COMMIT;



--② 퀴즈) DEPT 테이블에 데이터를 삭제하세요
--단, 20 번 부서를 삭제하세요

DELETE FROM DEPT
WHERE DNO = 20;
SELECT * FROM DEPT;
COMMIT;