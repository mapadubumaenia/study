-- 복잡한 조회: POST방식
-- TODO :전체조회
-- _search:조회 예약어
--  post/인덱스명/_search
--  {
--   "query": {"match_all": {}}
-- }

POST /employee/_search
{
   "query": {"match_all": {}}
}


POST /employee/_search
{
   "_source": ["eno","ename"], 
   "query": {"match_all": {}}
}