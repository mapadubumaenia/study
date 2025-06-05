--£ 커미션을(COMMISSION) 받는 모든 사원의 이름(ENAME), 부서 이름(DNAME)
--부서 위치(LOC)를 화면에 표시하세요

SELECT E.*,D.* FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO = D.DNO
AND E.COMMISSION IS NOT NULL;


--£ = 조인과 Like 검색를 사용하여 이름에(ENAME) A 가 포함된 모든 사원의
--이름과(ENAME) 부서명을(DNAME) 화면에 표시하세요

SELECT E.*, D.* FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO = D.DNO
AND E.ENAME LIKE '%A%';


--£ NEW YORK 에 근무하는(LOC) 모든 사원의 이름(ENAME),
--업무(JOB), 부서번호(DNO) 및 부서명을(DNAME) 화면에 표시하세요

SELECT E.ENAME
,E.JOB
,E.DNO
,D.DNAME 
FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO = D.DNO
AND D.LOC = 'NEW YORK';








