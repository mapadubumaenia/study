-- 01_인덱스만들기
-- 예제) DEPT 인덱스를 만드세요.
-- 단, DEPARTMENT 정보를 확인하고 똑같이 만드세요
-- 매핑 정보 확인 사용법: GET /인덱스/_mapping
GET /department/_mapping

-- dept 새 인덱스 만들기
-- TODO: mappings - properties
-- TODO: 자료형: 1) 정수: integer, (실수: float)
-- TODO:         2) 글자: text(자연어 검색), keyword(용어 검색)
-- TODO:         3) 날짜: date
-- TODO: 이미지는 오라클에서 관리 -> 복제) 이미지 다운로드 url 만 전송



PUT /dept
{
  "mappings": {
    "properties": {
      "dno": {"type": "integer"},
      "dname": {
        "type": "text",
        "fields": {"keyword": {"type": "keyword"}}
      },
      "insert_time": {
        "type": "date"
      },
      "update_time": {
        "type": "date"
      }
    }
  }
}

-- 확인
GET /dept/_mapping