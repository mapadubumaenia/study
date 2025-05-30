-- 오랜만에 써보는 주석!~ CTRL + / 로 주석을 달 수 있다.
-- 부서정보 테이블을 전체 조회하세요
--명령어: SELECT: 조회명령어
--   *  : 제목행(컬럼), 모든 컬럼을 선택
--  FROM   : 다음에 테이블 이름이 옵니다.
--기본 대소문자 구분하지 않는다!
SELECT * FROM  DEPARTMENT;



--③ 예제) 부서 테이블의 컬럼 중에 DNO, LOC 만 조회하세요
--사용법: SELECT 컬럼1,컬럼2,... FROM 테이블명;
SELECT DNO,LOC FROM DEPARTMENT;
