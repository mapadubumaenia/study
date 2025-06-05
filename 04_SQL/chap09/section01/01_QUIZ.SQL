--② 퀴즈) 사원번호가 7499 인 사원들에 소속된 부서 정보를 모두 표시하세요


SELECT  D.*
FROM EMPLOYEE  E
,DEPARTMENT  D
WHERE E.DNO = D.DNO
AND ENO =7499;