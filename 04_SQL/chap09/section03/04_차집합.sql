--£ 차집합 사용하기
--① 예제) 부서번호를 기준으로 차집합해서 부서,사원테이블의 행을 모두 세로로 화면에 표시하
--세요

SELECT DNO FROM DEPARTMENT
MINUS
SELECT DNO FROM EMPLOYEE;

-- 차집합: 중복제거해서 빼기