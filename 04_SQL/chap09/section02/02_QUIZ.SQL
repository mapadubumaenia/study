--② 퀴즈) 부서별 최대 급여를 받는 사원 중에서 이름을 화면에 표시하세요

SELECT ENAME FROM EMPLOYEE
WHERE SALARY IN (SELECT MAX (SALARY) FROM EMPLOYEE
                    GROUP BY DNO);
