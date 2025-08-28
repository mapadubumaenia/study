
-- 예제) 부서번호가 10 과 30 사이  조회하고 페이징하세요
-- 단, from(0), size(3) 사용하세요
-- select * from employee
-- where dno between 10 and 30
-- TODO: query - range

POST /employee/_search
{
  "from": 3, 
  "size": 3, 
  "query": {
    "range": {
      "dno": {
        "gte": 10,
        "lte": 30
      }
    }
  }
}

-- ③ 예제) 부서번호가 10 과 20 사이 속하지 않는 부서를 페이징 하세요
-- 단, from(0), size(3) 사용하세요

POST /employee/_search
{
  "from": 0,
  "size": 3, 
  "query": {
    "bool": {
      "must_not": [
        {"range": {
          "dno": {
            "gte": 10,
            "lte": 20
          }
        }}
      ]
    }
  }
}


