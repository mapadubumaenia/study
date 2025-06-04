--£ 월의 마지막 날짜가 무엇인지 보여주는 함수
--① 예제) 사원 테이블의 입사일 컬럼의 마지막 날짜가 각각 무엇인지 화면에 표시하세요

--사용법) SELECT LAST_DAY(컬럼) FROM 테이블
--월 마지막 날짜 종류, 28,29,30,31
SELECT HIREDATE
 ,LAST_DAY(HIREDATE)
 FROM EMPLOYEE;