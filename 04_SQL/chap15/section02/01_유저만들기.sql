--£ 유저를 만들어 봅시다. 
--① 예제) user01 을 만들고 암호는 1234567890 으로 하세요
--실습) 관리자(SYSTEM) 계정 (접속)

-- 기본 : c##유저명 만들어야하는데 안붙여도 되게하는 명령어 
ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;
--오라클 제품이 12버전 이상에서는 c##(접두어) 붙여서 만들어야함


--사용법) CREATE USER 계정 IDENTIFIED BY 암호;
-- "!암호",("" 붙이면 안에 특수기호를 사용할 수 있습니다.)
CREATE USER user01 IDENTIFIED BY 1234567890;