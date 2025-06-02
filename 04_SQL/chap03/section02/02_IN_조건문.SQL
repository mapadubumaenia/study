--£ IN 사용해서 조회하기
--① 예제) 상여금(COMMISSION) 300 이거나 500 이거나 1400 인 사원 조회하기
--논리연산자: AND(논리합),OR(논리합)
--비교연산자: >,<,=(같다),!=(같지않다),<>(같지않다)
--사용법)SELECT*FROM 테이블
--      WHERE 컬럼>=값;

SELECT * FROM EMPLOYEE
WHERE COMMISSION =300
OR COMMISSION = 500
OR COMMISSION = 1400;

--SQL 길이가 김(단점_  =>IN사용
--사용법: SELECT COMMISSION IN(값1,값2,..);
SELECT * FROM EMPLOYEE
WHERE COMMISSION IN (300,500,1400);





--£ 예제) NULL 이상: NULL 이 포함된 행은 조회되지 않습니다. 
--상여금(COMMISSION) 300 이거나 NULL 인 사원 조회하기
SELECT * FROM EMPLOYEE
WHERE COMMISSION IN(300,NULL);

