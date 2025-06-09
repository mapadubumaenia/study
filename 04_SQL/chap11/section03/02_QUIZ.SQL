--② 퀴즈) DEPT 테이블에 여러 데이터를 수정하세요
--단, 40 번 부서의 부서명을 운영부로 부서 위치를 대구 로 수정하세요


UPDATE DEPT
SET
DNAME='운영부'
,LOC='대구'
WHERE DNO=40;
COMMIT;

SELECT * FROM DEPT;
