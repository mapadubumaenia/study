--② 퀴즈) 이름에(ENAME) 'M' 으로 시작하는 사원 조회하기

SELECT * FROM EMPLOYEE
WHERE ENAME LIKE 'M%';



--③ 예제) 이름의 두번째 글자가 'A' 인 사원 조회하기
SELECT * FROM EMPLOYEE
WHERE ENAME LIKE '_A%';

--④ 퀴즈) 이름의 두번째 글자가 'O' 인 사원 조회하기
SELECT * FROM EMPLOYEE
WHERE ENAME LIKE '_O%';