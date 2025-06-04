--£ 부분 그룹 함수
--① 예제) 부서별(DNO) 평균 급여를(SALARY) 부서번호와 함께 화면에 표시하세요
--단, 소수점은 내림하세요(절삭)
--그룹  : 부서별(같은 부서번호끼리(부분데이터에 대해) 묶어서 보기)

SELECT DNO, SALARY FROM EMPLOYEE
ORDER BY DNO;  -- 부서별로 급여를 정렬한것

--사용법:  SELECT 컬럼, TRUNC(AVG(컬럼2)) FROM 테이블
--          GROUP BY 컬럼;

SELECT DNO
,TRUNC(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DNO;





