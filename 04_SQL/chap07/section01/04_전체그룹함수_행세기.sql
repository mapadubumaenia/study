--£ 테이블 값 개수를 세어봅시다. 
--① 예제) 상여금을(COMMISSION) 못 받는 사원 수 구하기
--상여금이 NULL 인 사원 수 구하기와 같습니다.
--사용법)  SELECT COUNT(*) FROM 테이블;
--        WHERE 컬럼 IS NULL;



SELECT COUNT(*) FROM EMPLOYEE
WHERE COMMISSION IS NULL;