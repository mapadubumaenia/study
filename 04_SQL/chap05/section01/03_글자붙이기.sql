--£ 글자 붙이기 함수
--① 예제) 부서테이블에서 부서명 앞에 Oracle 을 붙여서 화면에 표시하세요
--
--


SELECT 'Oracle' || DNAME
FROM DEPARTMENT;

SELECT CONCAT('Oracle',DNAME)
FROM department;