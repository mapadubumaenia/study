--② 예제) 위에서 만든 user01 유저에 여러 가지 권한을 줍시다
--실습) 관리자 계정으로 접속.

--접속 권한
GRANT CREATE SESSION TO USER01;

--테이블 만들 권한
GRANT CREATE TABLE TO USER01;

--부서 테이블 조회 권한
GRANT SELECT ON SCOTT.DEPARTMENT TO USER01;

--테이블 하드디스크 공간을 무한히 주기 권한
GRANT UNLIMITED TABLESPACE TO USER01;

--권한 뺏기
REVOKE CREATE TABLE FROM USER01;