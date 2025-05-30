--£ 조건식과 NOT 논리 연산자와 함께 사용하기
--① 예제) 10 번 부서(DNO) 에 소속된 사원은 제외하고(NOT) 출력하기

SELECT * FROM EMPLOYEE
WHERE NOT DNO=10;


--또다른 표현
SELECT * FROM EMPLOYEE
WHERE  DNO!=10;