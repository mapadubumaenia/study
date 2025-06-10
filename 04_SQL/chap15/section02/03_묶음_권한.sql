--③ 예제) 위에서 만든 유저에게 롤(ROLE)을 주세요
-- 앞의 예제처럼 권한을 일일히 주면 피곤하다!
-- 미리 잘쓰는 권한들을 묶어 놓았음! : 롤(ROLE)
--USER01 에세 롤을 주겠다!
--사용법: GRANT 권한명1,권한명2...TO 계정;
--예) CONNECT, RESOURCE(롤) , CREATE VIEW(뷰 만들 권한)

GRANT CONNECT, RESOURCE, CREATE VIEW TO user01;

--롤)  1) CONNECT: 접속에 관련된 권한들을 묶어 놓았음
--     2) RESOURCE : 테이블, 인덱스, 시퀀스 등을 생성,수정,사용 등을 할 수 있는 권한들
