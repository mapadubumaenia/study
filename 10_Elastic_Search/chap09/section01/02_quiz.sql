-- ② 퀴즈) edx-emp 테이블을 만드세요. 필드는 eno, ename 2 개로 만듭니다. 공통 필드는 update-time, insert-time, 2 개로 하세요
-- 접두어는 edx-* 로 하세요


PUT _index_template/idx_ctamplate
{
  "index_patterns": ["edx-*"],
  "priority": 10,
  "template": {
    "settings": {
      "number_of_shards": 1,
      "number_of_replicas": 1
    },
    "mappings": {
      "properties": {
        "insert_time":{
          "type": "date"
        },
        "update_time":{
          "type": "date"
        }
      }
    }
  }
}


PUT /edx-emp
{
  "mappings": {
    "properties": {
       "eno":{"type": "integer"},
       "ename":{"type": "text",
        "fields": {"keyword":{ "type":"keyword"}}
      }
    }
  }
}
GET /edx-emp/_mapping
