-- TODO: 범위(range) 집계
-- 예제) 급여를(SALARY) 0~1500, 1500~5000 단위로 각각 집계해서 표시하세요
-- TODO: aggs - 별명 - range - {"field": "필드", "ranges": [...] }
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "aggs": {"별명"{: "range": {"field": "필드", "ranges": [...] }}}
--              }
POST /employee/_search
{
  "size": 0,
  "aggs": {
    "psalary": {
      "range": {
        "field": "salary",
        "ranges": [
          {
            "from": 0,
            "to": 1500
          },
          {
            "from": 1500,
            "to": 5000
          }
        ]
      }
    }
  }
}