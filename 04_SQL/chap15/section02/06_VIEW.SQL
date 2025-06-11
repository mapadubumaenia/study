--£ 뷰를 만들어 봅시다. 
--① 예제) ENO(사원번호), ENAME(사원명), DNO(부서번호), JOB(직위) 컬럼만 화면에 출력
--하는 뷰를 만들고 삭제하세요
--목적: 1)보안: 테이블의 모든 컬럼을 보여주기 싫어서 사용: 연봉(보안), 주민번호등
--2) 테이블의 컬럼을 몇개 줄려서 사용: 코딩이 간결해 짐(컬럼 10개-> 항상사용: 5개만 함(뷰 사용고려)


CREATE OR REPLACE VIEW VW_EMPLOYEE(ENO, ENAME, DNO, JOB)
AS
SELECT ENO, ENAME, DNO, JOB
FROM EMPLOYEE;
-- 뷰 2 생성 : 뷰이름 뒤에 컬럼명 생략가능
CREATE OR REPLACE VIEW VW_EMPLOYEE
AS
SELECT ENO, ENAME, DNO, JOB
FROM EMPLOYEE;
-- 오라클 DB 에서 미리 만들어둔 뷰(딕셔너리 뷰): 관리자용
SELECT * FROM VW_EMPLOYEE; -- 뷰 조회



--② 예제) 위에서 만든 뷰를 삭제합니다.
DROP VIEW VW_EMPLOYEE;