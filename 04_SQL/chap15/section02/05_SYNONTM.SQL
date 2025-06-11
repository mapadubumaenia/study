--⑤ 예제) 시노님(동의어)을 만들고 삭제하세요
--테이블이 너무 깁니다.-> 별명을 붙여서 바꿀수 있습니다.(동의어)
--사용법) CREATE SYNONYM 별명 FOR 원본테이블;

CREATE SYNONYM DEPT FOR DEPARTMENT;


SELECT * FROM DEPT;