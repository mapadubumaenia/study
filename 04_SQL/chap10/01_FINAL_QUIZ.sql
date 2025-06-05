--조인을 이용해서 SCOTT 사원의(ENAME) 부서번호와(DNO)
--부서이름을(DNAME) 화면에 표시하세요

SELECT D.DNO, D.DNAME FROM EMPLOYEE E
, DEPARTMENT D
WHERE E.DNO = D.DNO
AND ENAME='SCOTT';


--£ 모든 사원의 사원이름과(ENAME) 그 사원이 소속된 부서이름(DNAME)과
--부서위치(LOC)를 화면에 표시하세요

SELECT E.ENAME, D.DNAME ,D.LOC FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO = D.DNO
ORDER BY DNAME;


--£ 10 번 부서에(DNO) 속하는사원번호에(ENO) 대해 직급과(JOB)
--부서위치(LOC)를 화면에 표시하세요

SELECT * FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO = D.DNO
AND D.DNO =10;