--£ 테이블 값 개수를 세어봅시다. ① 예제) 직위(JOB)의 종류가 몇 개인지 출력하기
--단, DISTINCT 예약어를 사용하세요
-- 사용법) SELECT COUNT(컬럼) FROM 테이블; // NULL 제외하고 개수 세기

SELECT COUNT(DISTINCT JOB)
FROM EMPLOYEE;