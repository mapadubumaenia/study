--£ 교집합 사용하기
--① 예제) 부서번호를 기준으로 같은 데이터만 부서,사원테이블의 행을 모두 세로로 화면에 표
--시하세요


SELECT DNO FROM DEPARTMENT
INTERSECT
SELECT DNO FROM EMPLOYEE;

