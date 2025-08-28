-- TODO: 통합 검색
-- 01_여러인덱스or검색.sql
-- 예제) 모든 인덱스의(department, employee) 모든 필드에서 SCOTT 이 있는 단어를 찾
-- 아서 모두 화면에 표시하세요
-- TODO: POST /인덱스,인덱스2,.../_search
-- TODO: query - multi_match {"query": "검색어","fields": ["*"]}
-- TODO: * : 모든 필드대상
-- TODO: 자연어 검색: match, multi_match
--     (대소문자 구분 없음)
-- 사용법:
-- POST /인덱스,인덱스2,.../_search
-- {
--   "query": {
--     "multi_match": {
--       "query": "검색어",
--       "fields": ["필드명","필드명2",...]
--     }
--   }
-- }
POST /department,employee/_search
{
  "query": {
    "multi_match": {
      "query": "scott",
      "fields": ["*"]
    }
  }
}


-- 예제 2) 모든 인덱스의(department, employee) 모든 필드에서 SMITH 또는 SALES 가 있
-- 는 단어를 찾아서 모두 화면에 표시하세요
-- TODO: POST /인덱스,인덱스2,.../_search
-- TODO: query - multi_match {"query": "검색어","fields": ["*"]}
-- TODO: 옵션 : "operator": "or" , 기본옵션으로 생략 가능합니다.
-- 사용법: or: 각 검색어들중에 1개라도 있는것은 화면에 표시됩니다.
-- POST /인덱스,인덱스2,.../_search
-- {
--   "query": {
--     "multi_match": {
--       "query": "검색어 검색어2 ...",
--       "fields": ["필드명","필드명2",...],
--       "operator": "or" (생략)
--     }
--   }
-- }
POST /department,employee/_search
{
  "query": {
    "multi_match": {
      "query": "SMITH SALES",
      "fields": ["*"],
      "operator": "or"
    }
  }
}
