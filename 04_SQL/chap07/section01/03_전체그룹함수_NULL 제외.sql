--£ 전체 그룹 함수는 NULL 값을 자동으로 뺍니다.
--① 예제) 사원들의(EMPLOYEE) 상여금(COMMISSION) 총액을 화면에 표시하세요
--단, 행의 NULL 값은 빼고 총액을 계산하세요
-- 알잘딱 NULL을 빼고 계산해준다!



SELECT SUM(COMMISSION) FROM EMPLOYEE;