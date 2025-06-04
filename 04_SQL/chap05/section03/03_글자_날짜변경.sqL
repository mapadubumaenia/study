--£ 글자를 날짜 자료형으로 바꾸기
--① 예제) 사원테이블의 입사일에서 ‘80/12/17’을 날짜형으로 바꾸어서 조회하세요

-- 사용법) SELECT * FROM 테이블
--        WHERE HIREDATE = TO_DATE('글짜','날짜포맷');
-- 조건        : 입사일에서 ‘80/12/17’을 날짜형으로 바꾸어서(날짜함수)
-- (참고) WHERE 컬럼(날짜형) = '80/12/17'(글자형) => 
--         내부적으로 오라클이 글짜를 날짜로 바꾸어서 비교함 
SELECT ENAME,HIREDATE
FROM EMPLOYEE
WHERE HIREDATE = TO_DATE('80/12/17');