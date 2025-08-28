-- 01_삭제.sql
-- 예제) DEPT 데이터를 삭제하세요
-- 단, 10번 부서 삭제하세요

-- 전체조회
POST /dept/_search
{
  "query": {
    "match_all": {}
  }
}

-- 데이터 삭제하기: 
-- TODO: 사용법:  DELETE /인덱스/_doc/기본키(문서번호)
DELETE /dept/_doc/20

--인덱스 삭제하기
DELETE /dept
