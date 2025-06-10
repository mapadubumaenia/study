--£ 인덱스 만들기
--① 예제) 아래의 SQL 문이 자바에서 실행되는데 느리다고 합니다. 인덱스를 어디에 만들어야 할까요?

--컬럼 1개짜리 인덱스
--컬럼 2개짜리 인덱스(결합인덱스)
SELECT * FROM DEPARTMENT
WHERE DNAME = 'SALES'
AND LOC = 'NEW YORK';


--(참고)
--CREATE INDEX IX_DEPARTMENT_DNAME ON DEPARTMENT(DNAME);
--인덱스 사용법
CREATE INDEX IX_DEPARTMENT_DNAME_LOC ON DEPARTMENT(DNAME,LOC);

