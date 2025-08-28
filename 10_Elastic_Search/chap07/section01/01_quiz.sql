-- ③ 퀴즈) 모든 인덱스의(department, employee) 모든 필드에서 SCOTT 또는 RESEARCH
-- 가 있는 단어를 찾아서 모두 화면에 표시하세요

POST /department,employee/_search
{
  "query": {
    "multi_match": {
      "query": "SCOTT RESEARCH",
      "fields": ["*"],
      "operator": "or"
    }
  }
}
