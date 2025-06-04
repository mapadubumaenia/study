--£ DECODE(CASE WHEN) 함수로 직급에(JOB) 따라 급여를(SALARY)
--인상하도록 하세요. 직급이(JOB) 'ANALYST' 이면 200,
--'SALESMAN' 이면 180, 'MANAGER' 이면 150
--'CLERK' 이면 100 을 인상하세요.

SELECT JOB
 ,CASE WHEN JOB ='ANALYST' THEN SALARY+200
  WHEN JOB ='SALESMAN' THEN SALARY+180
  WHEN JOB ='MANAGER' THEN SALARY+150
  WHEN JOB ='CLERK' THEN SALARY+100
  END       AS인상된급여
  FROM EMPLOYEE;
  
  
  
--  £ 사원테이블에서(EMPLOYEE) 사원들의 월 평균 근무일 수는 21.5 일입니다. 
--하루 근무 시간을 8 시간으로 보았을 때 사원들의 하루 급여를 계산하여
--사원명(ENAME), 하루급여 결과를 화면에 표시하세요
--단 하루 급여는 소수점 세 번째 자리에서 내림하세요
--하루 급여 계산 : 급여(SALARY) / 21.5

SELECT ENAME
,TRUNC(SALARY/21.5,2)
FROM EMPLOYEE;






