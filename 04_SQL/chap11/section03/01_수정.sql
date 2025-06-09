--£ 테이블에 데이터 수정하기
--① 예제) DEPT 테이블에 데이터를 수정하세요
--단, 20 번 부서의 부서명을 연구소로 수정하세요
--조건: 20 번 부서
--사용법: UPDATE DEPT
--       SET
--       컬럼='값'
--       WHERE 조건컬럼=값;     --생략=>  (모든 데이터를 수정할경우)
 
UPDATE DEPT
SET
DNAME ='연구소'
WHERE DNO =20;
COMMIT;


SELECT * FROM DEPT;