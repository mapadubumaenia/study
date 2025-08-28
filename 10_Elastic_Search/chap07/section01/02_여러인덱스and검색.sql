-- 예제) 모든 인덱스의(department, employee) 모든 필드에서 동시에 SMITH SALES 가 
-- 있는 단어를 찾아서 모두 화면에 표시하세요
-- 단 match(전문 검색, 자연어검색)을 이용하세요
-- match 검색은 자연어 분석기를 사용하고 속도가 빠릅니다
-- TODO: POST /인덱스,인덱스2,.../_search
-- TODO: query - multi_match {"query": "검색어","fields": ["*"]}
-- TODO: cross_fields 옵션: 각필드의 내용을 가상의 1개 필드로 모두 합쳐서 검색하게 합니다.
-- TODO: 예) dname: sales, loc: 부산 =>cross_fields 옵션걸기 : 가상필드: sales 부산

-- £ 통합검색: and, cross_fields
-- ① 예제) 모든 인덱스의(department, employee) 모든 필드에서 동시에 SMITH SALES 가
-- 있는 단어를 찾아서 모두 화면에 표시하세요
-- 단 match(전문 검색, 자연어검색)을 이용하세요
-- match 검색은 자연어 분석기를 사용하고 속도가 빠릅니다.


POST /department,employee/_search
{
  "query": {
    "multi_match": {
      "query": "SMITH CLERK",
      "fields": ["*"],
      "operator": "and",
      "type": "cross_fields"
    }
  }
}