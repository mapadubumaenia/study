--£ 평균 월급이(SALARY) 가장 적은 사원의 직위(JOB)를 찾아 직위와 평균 월급을
--표시하세요.

SELECT JOB ,SALARY FROM EMPLOYEE;

SELECT JOB,ROUND(AVG(SALARY)) FROM EMPLOYEE
GROUP BY JOB
HAVING ROUND(AVG(SALARY)) = (SELECT MIN(ROUND(AVG(SALARY))) FROM EMPLOYEE
                                GROUP BY JOB);


--£ 각 부서의 최소 월급(SALARY)를 받는 사원의 이름(ENAME), 급여, 부서
--번호(DNO)를 표시하세요.

SELECT ENAME, SALARY, DNO FROM EMPLOYEE
WHERE SALARY IN (SELECT MIN(SALARY)
                    FROM EMPLOYEE
                    GROUP BY DNO);
                    
--                    £ 사원번호가 7788 인 사원과 직위(JOB)가 같은 사원의 이름과 직위를
--표시하세요.표시하세요

SELECT ENAME,JOB FROM EMPLOYEE
WHERE JOB= (SELECT JOB FROM EMPLOYEE
           WHERE ENO =7788);
           
           
SELECT ENAME,JOB FROM EMPLOYEE
WHERE SALARY > (SELECT SALARY FROM EMPLOYEE
                WHERE ENO = 7499);
                
                
                
-- £ 10 번 부서에(DNO) 속하는사원번호에(ENO) 대해 직급과(JOB)
--부서위치(LOC)를 화면에 표시하세요    
SELECT * FROM EMPLOYEE E
,DEPARTMENT D
WHERE D.DNO =E.DNO
AND D.DNO=10;

--£ 커미션을(COMMISSION) 받는 모든 사원의 이름(ENAME), 부서 이름(DNAME)
--부서 위치(LOC)를 화면에 표시하세요
SELECT * FROM EMPLOYEE E
,DEPARTMENT D
WHERE D.DNO=E.DNO
AND COMMISSION IS NOT NULL;

--£ = 조인과 Like 검색를 사용하여 이름에(ENAME) A 가 포함된 모든 사원의
--이름과(ENAME) 부서명을(DNAME) 화면에 표시하세요
SELECT * FROM EMPLOYEE E
,DEPARTMENT D 
WHERE E.DNO=D.DNO
AND ENAME LIKE '%A%';




