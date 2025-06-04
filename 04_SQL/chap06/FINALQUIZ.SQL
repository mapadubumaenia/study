--£ 입사일(HIREDATE)을 날짜포맷 'YYYY-MM-DD HH24:MI:SS' 에 맞게 화면에
--보여주세요

SELECT TO_CHAR(HIREDATE,'YYYY-MM-DD HH24:MI:SS')
FROM EMPLOYEE;


--£ 올해 며칠이 지났는지 화면에 보여주세요
--현재 날짜에서 올해 1 월 1 일을 뺀 결과를 화면에 표시하세요
--소수점은 내림하세요

SELECT SYSDATE - TO_DATE('2025/01/01', 'YYYY/MM/DD') AS 지난일수
FROM DUAL;



--£ 사원들의(EMPLOYEE) 관리자(MANAGER) 사번을(ENO) 화면에 표시하세요. 
--관리자가 없는 사원에 대해서는 NULL 대신 0 을 표시하세요.

SELECT NVL(MANAGER,0)AS 관리자사번
FROM EMPLOYEE

