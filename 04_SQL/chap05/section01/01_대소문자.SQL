--£ 대문자/소문자/첫 글자만 대문자로 바꾸기 함수
--① 예제) 부서테이블에서 부서명을 대문자, 소문자, 첫 글자만 대문자로 바꾸어보세요
--부서테이블 :DEPARTMENT
--부서명: DNAME
-- 기본형 사용법)   SELECT * FROM 테이블
--                WHERE 컬럼 >= 값;

SELECT UPPER(DNAME)      --대문자
,LOWER(DNAME)            --소문자
,INITCAP(DNAME)          --첫글자만 대문자
FROM DEPARTMENT;