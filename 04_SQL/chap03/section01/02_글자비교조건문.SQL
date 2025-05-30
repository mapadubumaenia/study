--예제)사원명(ENAME) 이 SCOTT 인 사원의 정보를 출력하세요
--화면표시: * :전체칼럼선택

--조건:사원명(ENAME)이 SCOTT인 :ENAME='SCOTT'
--사용법) SELECT 컬럼,...FROM 테이블
--       WHERE 컬럼='값';
SELECT * FROM EMPLOYEE
WHERE ENAME='SCOTT';