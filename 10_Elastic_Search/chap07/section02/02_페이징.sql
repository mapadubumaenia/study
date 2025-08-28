-- TODO: 02_페이징
-- 예제) department 인덱스를 3개씩 1페이지에 보이도록 페이징하세요
-- TODO: from(오프셋,현재페이지번호+등차값), size(1페이지에 보일개수, 등차값)
-- TODO: 등차수열: 0*3(1페이지), (0*3)+3(2페이지), ((0*3)+3)+3(3페이지), (1*3+3)+3등
--                  0~2         3~5            6~8          9~11

-- 사용법:
-- POST /인덱스/_search
-- {
--   "from": 오프셋숫자, 
--   "size": 화면에보일개수, 
--   "query": {
--     "match_all": {}
--   }
-- }


-- 1페이지
POST /employee/_search
{
  "from": 0,
  "size": 3, 
  "query": {
    "match_all": {}
  }
}

-- 2페이지
POST /employee/_search
{
  "from": 3,
  "size": 3, 
  "query": {
    "match_all": {}
  }
}

-- 3페이지
POST /employee/_search
{
  "from": 6,
  "size": 3, 
  "query": {
    "match_all": {}
  }
}