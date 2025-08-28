-- 예제)  SCOTT 사원보다 급여를(SALARY) 많이 받는 사원이 누구인지 화면에 표시하세요
-- es 는 서브쿼리가 없습니다. 아래처럼 2번 조회해야 합니다.
-- 1) select salary from employee
--    where ename='SCOTT'
-- 3000
-- TODO; 정확일치: query - term
POST /employee/_search
{
  "_source": ["salary"], 
  "query": {
    "term": {
      "ename.keyword": {
        "value": "SCOTT"
      }
    }
  }
}

-- 2) 3000 급여보다 많이 받는 사원 표시
--   select * from employee
--   where salary>3000
-- TODO: query - range(>,< 등)
-- TODO: gte(>=), gt(>), lte(<=), lt(<)

POST /employee/_search
{
  "query": {
    "range": {
      "salary": {
        "gt": 3000
      }
    }
  }
}