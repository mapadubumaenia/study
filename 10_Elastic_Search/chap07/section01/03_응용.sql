-- 예제) 모든 인덱스의(department, employee) ename, job 필드에서 SALES 
-- SALESMAN 가 있는 단어를 찾으세요
-- 동시에 salary 가 1250 인 정보를 정확히 용어 검색하세요
-- 단 multi_match(전문 검색, 자연어검색)와 bool - must 를 이용하세요
-- 용어 검색은 term 을 이용합니다.
-- TODO: POST /인덱스,인덱스2,.../_search
-- TODO: 자연어 검색      : query - multi_match {"query": "검색어","fields": ["*"]}
-- TODO: 용어(keyword)검색: query - term : salary(1250)
-- TODO: query - bool - must(and) - multi_match 
-- TODO:                            term

POST /department,employee/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "multi_match": {
            "query": "SALES SALESMAN",
            "fields": ["ename","job"]
          }
        },
        {
          "term": {
            "salary": {
              "value": 1250
            }
          }
        }
      ]
    }
  }
}