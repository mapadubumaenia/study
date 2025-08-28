-- 예제) dept 첫번째 문서 여러 데이터 수정하기
-- TODO: doc - 필드:값, 필드2:값2, ...
-- 사용법
-- POST /인덱스/_update/기본키(문서번호)
-- {
--   "doc": {
--     "필드":"값"
--     "필드2":"값2"
--     ...
--   }
-- }
POST /department/_search
{
  "query": {
    "match_all": {}
  }
}

POST /department/_update/20
{
  "doc": {
    "dname":"개발부2",
    "loc": "부산"
  }
}