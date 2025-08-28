-- 예제) DEPT 에 데이터를 추가하세요
-- 문서번호를(기본키 같은것) 램덤 생성되게 추가하세요
-- TODO: ES DB 기본키(uuid)를 자동으로 만들어줌
-- TODO: 1) 기본키 랜덤 추가: 
-- TODO: 2) nosql : commit, rollback 없음(즉시 반영)
-- 사용법:
-- POST /인덱스/_doc
-- {
--   "필드명": 값,
--   "필드명2": "값2",
--   ...
-- }
POST /dept/_doc
{
  "dno": 10,
  "dname": "ACCOUNTING",
  "loc": "NEW YORK",
  "insert_time": "2025-07-30T00:00:00",
  "update_time": null
}

-- dept 전체조회
POST /dept/_search
{
  "query": {
    "match_all": {}
  }
}


-- ② 예제) DEPT 에 데이터를 추가하세요
-- 문서번호를(기본키 같은것) 10 번으로 지정하고 추가하세요
--TODO: uuid 안쓰고 직접 지정 추가(추천)

PUT /dept/_doc/10
{
  "dno":10,
  "dname":"ACCOUNTING",
  "loc":"NEW YORK",
  "insert_time":"2025-07-30T00:00:00",
  "update_tume": null
}

