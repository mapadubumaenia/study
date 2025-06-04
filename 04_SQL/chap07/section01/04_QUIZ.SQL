--② 퀴즈) 상여금을(COMMISSION) 받는 사원 수 구하기
--상여금이 NOT NULL 인 사원 수 구하기와 같습니다.


SELECT COUNT(*) FROM EMPLOYEE
WHERE COMMISSION IS NOT NULL;