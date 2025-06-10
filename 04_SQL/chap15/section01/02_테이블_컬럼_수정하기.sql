--£ 테이블 컬럼 크기 변경하기
--① 예제) 부서 테이블에(DEPT) 부서명(DNAME) 의 크기를 변경하세요

ALTER TABLE DEPT_SAMPLE
MODIFY DNAME VARCHAR(30);     --=> DNAME 의 크기가 30으로 커짐!
