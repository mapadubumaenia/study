--£ 안시 크로스 조인하기
--① 예제) 부서, 사원테이블을 공통컬럼 없이 조인해서 화면에 표시하세요
--위의 조인을 카티션 프로덕트라고(cartesian product) 합니다. 
--양쪽 행 개수를 곱한 수만큼 데이터가 조회됩니다.

-- 사용법) SELECT E.*, D.*
--        FROM 테이블1 E
--           , 테이블2  D
--        WHERE E.공통컬럼=D.공통컬럼


--카티션 프로덕트: 일치조건 없이 조인  =>조회수가 너무 많아져서 시간걸림(비추천)
SELECT E.*, D.*
FROM EMPLOYEE E
, DEPARTMENT D;


--안시 크로스 조인(카티션 프로덕트)  =>위 카티션 프로덕션과 같음 ,비추천 
SELECT E.*, D.*
FROM EMPLOYEE E
CROSS JOIN DEPARTMENT D;