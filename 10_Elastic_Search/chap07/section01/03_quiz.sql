-- 퀴즈) 모든 인덱스의(department, employee) ename, job 필드에서 ACCOUNTING 
-- CLERK 가 있는 단어를 찾으세요
-- 동시에 salary 가 800 인 정보를 정확히 용어 검색하세요
-- TODO: query - bool - must(and) - multi_match 
-- TODO:                            term



POST /department,employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"multi_match": {
          "query": "ACCOUNTING CLERK",
          "fields": ["ename","job"]
        }},
        {"term": {
          "salary": {
            "value": 800
          }
        }}
      ]
    }
  }
}

