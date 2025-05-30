-- SQL언어: DB(정보저장소)를 조작하는 언어
-- 주석단축키: Ctrl + /
-- 예제1) 부서번호 X10을 해서 화면에 표시하세요
-- -- 사용법: SELECT 컬럼FROM 테이블명;
--주의 *: 1개만 사용, 전체컬럼 선택
-- 컬럼*숫자:  *: 연산자 곱하기라는 뜻
SELECT DNO *10  FROM DEPARTMENT;


--예제2)사원 테이블에서 부서번호 칼럼에 중복은 뺴고 화면에 표시하세요
--사원: EMPLOYEE;
--사용법: SELECT DISTINCT 컬럼 FROM 테이블;
SELECT DISTINCT DNO FROM EMPLOYEE;

 