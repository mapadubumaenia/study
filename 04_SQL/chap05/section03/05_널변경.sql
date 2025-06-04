--£ NULL 을 숫자/글자로 바꾸기
--① 예제) 급여의 NULL 을 0 으로 바꾸어서 조회하세요

SELECT NVL(COMMISSION,0)
FROM EMPLOYEE;