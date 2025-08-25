-- ② 퀴즈) 사원 테이블에서(EMPLOYEE) 사원명으로(ENAME) 오름차순 정렬하세요
-- 단, 필드.keyword 로 정렬하세요



POST /employee/_search
{
  "query": {
    "match_all": {}
  },
  "sort": [
    {
      "ename.keyword": {
        "order": "asc"
      }
    }
  ]
}

-- ④ 퀴즈) 사원 테이블에서(EMPLOYEE) 사원명으로(ENAME) 내림차순 정렬하세요

POST /employee/_search
{
  "query": {
    "match_all": {}
  },
  "sort": [
    {
      "ename.keyword": {
        "order": "desc"
      }
    }
  ]
}
