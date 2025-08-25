-- 예제) 상여금(COMMISSION) 이 없는 사원을 조회
-- select * from employee
-- where commission is null
-- TODO: query - bool - must_not - exists - field: 필드명
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "bool": "must_not": [{"exists":{"field": "컬럼명"}}]
--              }
POST /employee/_search
{
  "query": {
    "bool": {
      "must_not": [
        {
          "exists": {
            "field": "commission"
          }
        }
      ]
    }
  }
}

-- 예제) 상여금(COMMISSION) 이 있는 사람 조회하세요
-- select * from employee
-- where commission is not null
-- TODO: query - bool - must - exists - field: 필드명
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "bool": "must": [{"exists":{"field": "컬럼명"}}]
--              }
POST /employee/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "exists": {
            "field": "commission"
          }
        }
      ]
    }
  }
}