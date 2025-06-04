--② 퀴즈) 부서 번호별(DNO), 직위별(JOB) 행 개수를 화면에 표시하세요


SELECT DNO,JOB
,COUNT(*) FROM EMPLOYEE
GROUP BY DNO,JOB
ORDER BY DNO;