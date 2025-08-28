-- ③ 퀴즈) emp 에 데이터를 추가하세요
-- 단, 문서번호는 랜덤 생성하세요

POST /emp/_doc
{
  "eno":7788,
  "ename":"MAFA",
  "insert_time":"2025-07-30T00:00:00",
  "update_tume": null
}



-- ④ 퀴즈) emp 에 데이터를 추가하세요
-- 단, 문서번호는 8000 으로 생성하세요


PUT /emp/_doc/8000
{
  "eno":8888,
  "ename":"MAFAsuper",
  "insert_time":"2025-07-30T00:00:00",
  "update_tume": null
}


-- 확인:
GET /emp/_mapping

POST /emp/_search
{
  "query": {
    "match_all": {}
  }
}