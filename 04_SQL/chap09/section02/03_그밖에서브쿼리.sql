--£ 기타 서브 쿼리 사용하기
--① 예제) 다양한 서브 쿼리를 화면에 보여주세요
--30 번 부서에서 최소 급여를 구한 후 그 최소 급여보다 부서별 최소 급여가 큰 부서만 화면
--에 표시하세요

--1) 30 번 부서에서 최소 급여를 구한 후
SELECT MIN(SALARY) FROM EMPLOYEE
WHERE DNO = 30;


--2)그 최소 급여보다 부서별 최소 급여가 큰 부서
--2-1)  부서별 최소 급여:
SELECT MIN(SALARY) FROM EMPLOYEE
GROUP BY DNO
HAVING MIN(SALARY)>=950;


SELECT MIN(SALARY) FROM EMPLOYEE
GROUP BY DNO
HAVING MIN(SALARY) >(SELECT MIN(SALARY) FROM EMPLOYEE
WHERE DNO = 30);


--그밖에 2) SELECT 에서 서브쿼리 사용 가능
SELECT 2*3, (SELECT 4*3 FROM DUAL) FROM DUAL;

--그 밖에 3)FROM 뒤에도 서브쿼리 사용가능(용어: 인라인 뷰)
SELECT EM.* 
FROM (SELECT * FROM EMPLOYEE WHERE DNO =30) EM;