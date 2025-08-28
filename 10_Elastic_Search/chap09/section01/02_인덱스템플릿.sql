-- 예제) 공통 템플릿을 이용해서 인덱스 idx-dept 로 만들세요
-- 필드는 dno, dname 2개로 만듭니다.
-- 공통 필드는 update-time, insert-time, 2 개로 하세요
-- 접두어는 idx-* 로 하세요
-- TODO: index_patterns : ["접두어-*"] (인덱스명에 접두어가 있으면 적용됨)
-- TODO: "priority": 우선순위숫자 (클수록 먼저 공통템플릿이 적용됨)
-- TODO: "template": { "settings": {샤딩개수, 복제개수}, {"mappings": "properties":{공통필드정의}}}
PUT _index_template/idx_ctemplate
{
  "index_patterns": ["idx-*"],
  "priority": 10,
  "template": {
    "settings": {
      "number_of_shards": 1,
      "number_of_replicas": 1
    },
    "mappings": {
      "properties": {
        "insert_time": {
          "type": "date"
        },
        "update_time": {
          "type": "date"
        }        
      }
    }
  }
}

-- 확인
-- TODO: mappings - properties
PUT /idx-dept
{
  "mappings": {
    "properties": {
      "dno": {
        "type": "integer"
      },
      "dname": {
        "type": "text",
        "fields": {"keyword": {"type": "keyword"}}
      }
    }
  }
}

Get /idx-dept/_mapping