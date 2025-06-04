--£ 최초로 도래하는 요일 구하기 함수
--① 예제) 현재 날짜를 기준으로 최초로 도래하는 특정 요일의 날짜를 화면에 표시하세요
--사용법) SELECT NEXT_DAY(컬럼,'요일') FROM 테이블;

SELECT SYSDATE
 ,NEXT_DAY(SYSDATE,'토요일')
 FROM DUAL;
