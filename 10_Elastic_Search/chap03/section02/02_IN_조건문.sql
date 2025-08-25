-- 예제 2) 상여금(COMMISSION) 300 이거나 500 이거나 1400 이 아닌 사원 조회하기
-- select * from employee
-- where commission not in (300,500,1400)
-- TODO: 정확한 조회 3개(or): query - bool - must_not - terms - 필드:[값,값2,...]
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "bool": "must_not": [{"terms":{"필드": [값,값2,...]}}]
--              }
POST /employee/_search
{
  "query": {
    "bool": {
      "must_not": [
        {
          "terms": {
            "commission": [
              300,
              500,
              1400
            ]
          }
        }
      ]
    }
  }
}