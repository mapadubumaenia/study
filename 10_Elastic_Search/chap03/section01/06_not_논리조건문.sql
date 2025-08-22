-- ① 예제) 10 번 부서(DNO) 에 소속된 사원은 제외하고(NOT) 출력하기
-- select * from employee where not dno = 10

-- TODO: query - bool - must_not(not, 부정) - term(=)
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "bool":{"must_not": [{"term":{필드:값}}]}
--              }


POST /employee/_search
{
  "query": {
    "bool": {
      "must_not": [
        {"term": {
          "dno": {
            "value": 10
          }
        }}
      ]
    }
  }
}

