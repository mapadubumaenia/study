-- 예제)  department 인덱스의 행개수를 구하세요
-- null 은 제외하고 셉니다
-- select count(*) from department
-- TODO: query - match_all
-- TODO: _count : 전체 행개수 보기
-- TODO: 사용법: POST /인덱스명/_count
--              {
--                 "query": {"match_all": {}}
--              }
POST /department/_count
{
  "query": {
    "match_all": {}
  }
}