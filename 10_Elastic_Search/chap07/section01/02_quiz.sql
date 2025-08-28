-- ② 퀴즈) 모든 인덱스의(department, employee) 모든 필드에서 동시에 SCOTT
-- RESEARCH 가 있는 단어를 찾아서 모두 화면에 표시하세요
-- 단 match(전문 검색, 자연어검색)을 이용하세요
-- match 검색은 자연어 분석기를 사용하고 속도가 빠릅니다.


POST /department,employee/_search
{
  "query": {
    "multi_match": {
    "query": "SCOTT ANALYST",
    "fields": ["*"],
    "operator": "and",
    "type": "cross_fields"
  }}
}