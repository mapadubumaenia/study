--£ 내림 함수
--① 예제) 12.34 를 내림해서 1 째자리까지 화면에 표시하세요
--사용법) SELECT * FROM DUAL;
--실무용어: 내림(버림,절삭)
--금액계산: 예산뽑기(소수점을 보통 절삭)
SELECT TRUNC(12.34,1) FROM DUAL;


--참고 내림: 무조건 정수로 만드는 내림함수
SELECT FLOOR(12.34) FROM DUAL;
