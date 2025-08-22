-- ① 예제) 입사일(HIREDATE) 이 '1981/01/01' 이전인(이하) 사원만 표시하세요
-- 범위 조회: query - range

-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": {"range": {"필드": {"value": "값"}}}
--              }

POST /employee/_search
{
  "query": {
    "range": {
      "hiredate": {
        "lte": "1981-01-01"
      }
    }
  }
}