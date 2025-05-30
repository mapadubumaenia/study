--예제2)사원 테이블에서 부서번호 칼럼에 중복은 뺴고 화면에 표시하세요
--사원: EMPLOYEE;
--사용법: SELECT DISTINCT 컬럼 FROM 테이블;
SELECT DISTINCT DNO FROM EMPLOYEE;


--예제) 현재 날짜 정보를 화면에 표시하세요
--SYSDATE :함수 또는 속성, 현재 날짜 정보를 제공
--DUAL: 가상테이블, 테스트 용도 사용
SELECT SYSDATE FROM DUAL;


-- 예제) 2 x 3 + 4 결과를 화면에 표시하세요
SELECT 2 * 3 + 4 FROM DUAL;
