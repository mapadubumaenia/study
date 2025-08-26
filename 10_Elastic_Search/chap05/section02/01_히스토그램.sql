--  TODO: 히스토집계
--  예제) 급여를 (salary) 1000 단위로 각각 집계해서 표시하세요
--  급여: 800~ 5000(사장님)
--    1000 간격으로 정보를 보기

-- TODO: aggs - 별명 - histogram - {"field": "필드", "interval": 숫자 }
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "aggs": {"별명"{: "histogram": {"field": "필드", "interval": 숫자 }}}
--              }



POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "hsalary": {
      "histogram": {
        "field": "salary",
        "interval": 1000
      }
    }
  }
}
