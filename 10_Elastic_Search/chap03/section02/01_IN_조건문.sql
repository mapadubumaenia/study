-- £ [] 사용해서 조회하기
-- ① 예제) 상여금(COMMISSION) 300 이거나 500 이거나 1400 인 사원 조회하기
-- 정확한 조회 3개(or): query - terms - field - [value1, value2, value3]
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "terms":{"필드": [값,값2,...]}
--              }

POST /employee/_search
{
  "_source": ["ename","commission"], 
  "query": {
    "terms": {
      "commission": [300, 500, 1400]
    }
  }
}