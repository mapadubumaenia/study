--② 퀴즈) EMP 테이블에 데이터를 추가하세요
--단, EMPLOYEE 테이블의 데이터를 복사해서 사용하세요.



INSERT INTO EMP
SELECT * FROM EMPLOYEE;

COMMIT;

SELECT * FROM EMP;


