-- ② 퀴즈) 급여가(SALARY) 1000 과 4000 사이의 사원 조회하고 페이징하세요
-- 단, from(0), size(3) 사용하세요 

POST /employee/_search
{
  "from": 0,
  "size": 3, 
  "query": {
    "range": {
      "salary": {
        "gte": 1000,
        "lte": 4000
      }
    }
  }
}


-- ④ 퀴즈) 급여가(SALARY) 1000 과 2000 사이가 아닌 사원 조회하고 페이징하세요
-- 단, from(0), size(3) 사용하세요 

POST /employee/_search
{
  "from": 0,
  "size": 3, 
  "query": {
    "bool": {
      "must_not": [
        {"range": {
          "salary": {
            "gte": 1000,
            "lte": 2000
          }
        }}
      ]
    }
  }
}
