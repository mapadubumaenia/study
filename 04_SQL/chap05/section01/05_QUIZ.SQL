-- 사원테이블에서 사원명의 첫글자부터 1개만 잘라서 화면에 표시하세요.


SELECT ENAME
,SUBSTR(ENAME,1,1)
FROM EMPLOYEE