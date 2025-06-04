--£ 전체 그룹 함수
--① 예제) 사원들의 급여(SALARY) 총액, 최고액을 화면에 표시하세요

SELECT SUM(SALARY) AS 총액
,MAX(SALARY) AS 최고액
FROM EMPLOYEE;
