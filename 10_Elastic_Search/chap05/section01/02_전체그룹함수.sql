-- TODO: 퍼센트 집계
-- 예제) salary 에서 25%에 해당하는 급여와 75% 해당하는 급여를 표시하세요
-- TODO: 의미? 그 회사에서 급여수준이 하위 25%에 해당되는 정보 조회
--          상위 75%에 해당되는 정보를 보여줌   

-- TODO: aggs - 별명 - percentiles
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "aggs": {"별명"{: "percentiles": {"field": "필드명", "percents":[값,값2,...]}}}
--              }



POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "psalary": {
      "percentiles": {
        "field": "salary",
        "percents": [
          25,
          75
        ]
      }
    }
  }
}
