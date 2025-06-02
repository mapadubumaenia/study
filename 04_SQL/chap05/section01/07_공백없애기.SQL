--£ 글자에 공백 없애기 함수
--① 예제) 글자 양옆에 공백을 없애 보세요
-- 테이블: DUAL

SELECT LTRIM('  Oracle DB   ')
, RTRIM('  Oracle DB   ')
, TRIM('  Oracle DB  ')
FROM DUAL;



