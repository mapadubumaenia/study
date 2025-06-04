--£ 전체 중에 몇 개 행만 가져와서 보여주기
--① 예제) 부서 테이블에서 부서명을 2 행만 가져와서 화면에 보여주세요.
--        SELECT 컬럼 FROM 테이블
--        WHERE ROWNUM<= 행수;
         
SELECT DNAME FROM DEPARTMENT
WHERE ROWNUM <=2;