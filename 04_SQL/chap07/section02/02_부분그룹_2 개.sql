--£ 부분 그룹을 여러 컬럼에 대해서 사용하기
--① 예제) 부서번호별(DNO), 직위별(JOB) 급여(SALARY) 총액(SUM) 화면에 표시하세요

SELECT DNO
,JOB
,SUM(SALARY)
FROM EMPLOYEE
GROUP BY DNO,JOB
ORDER BY DNO;