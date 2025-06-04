--② 퀴즈) 직위별(JOB) 평균 급여를 화면에 표시하세요
--단, 소수점은 내림하세요(절삭)



SELECT JOB,TRUNC(AVG(SALARY))
FROM EMPLOYEE
GROUP BY JOB;