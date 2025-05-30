--£ BETWEEN 사용해서 조회하기
--① 예제) 월급이(SALARY) 1000 과 1500 사이의 사원 조회하기
--조건1) 월급이(SALARY) 1000이상이고 (AND)
--조건2) 월급이(SALARY) 1500이하인;

SELECT * FROM EMPLOYEE
WHERE SALARY BETWEEN 1000 AND 1500;