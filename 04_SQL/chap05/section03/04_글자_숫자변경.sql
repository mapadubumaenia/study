-- 예제) ‘100,000’을 숫자로 바꾸어서 조회하세요
-- ‘999,999’ 숫자 포맷을 사용하세요 
-- 테이블명: DUAL
-- 사용법) SELECT TO_NUMBER('글자','숫자포맷') FROM 테이블
SELECT TO_NUMBER('100,000','999,999') FROM DUAL;