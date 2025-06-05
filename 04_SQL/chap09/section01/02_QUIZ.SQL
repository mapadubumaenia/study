--② 퀴즈) 사원 번호가(ENO) 7369 또는 7521,7499 인 사원들에 소속된 부서 정보를 모두 화
--면에 표시하세요



SELECT E.*,D.*
FROM EMPLOYEE E
,DEPARTMENT D
WHERE E.DNO = D.DNO
AND E.ENO IN (7369,7521,7499);