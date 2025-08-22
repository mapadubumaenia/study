-- 복잡한 조회: POST방식
-- TODO :전체조회
-- _search:조회 예약어
--  post/인덱스명/_search
--  {
--   "query": {"match_all": {}}
-- }
 POST /department/_search
 {
    "query":{
      "match_all": {}
    }
 }

-- TODO 2)전체조회: 일부필드만 보기
--  post/인덱스명/_search
--  {
--  "_source": ["필드명1", "필드명2"],
--   "query": {"match_all": {}}
-- }
  POST /department/_search
 {
    "_source": ["dno","dname"], 
    "query":{
      "match_all": {}
    }
 }
