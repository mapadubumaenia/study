-- ② 퀴즈) emp 데이터를 삭제하세요
-- 단, 8000 번 사원을 삭제하세요



DELETE /emp/_doc/8000

DELETE /emp


-- 확인용 전체조회
POST /emp/_search
{
  "query": {
    "match_all": {}
  }
}
