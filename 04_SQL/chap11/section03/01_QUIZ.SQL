--② 퀴즈) DEPT 테이블에 데이터를 수정하세요
--단, 30 번 부서의 부서명을 판매부로 수정하세요


UPDATE DEPT
SET
DNAME='판매부'
WHERE DNO = 30;
COMMIT;
SELECT * FROM DEPT;