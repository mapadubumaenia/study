-- ② 퀴즈) 입사일(HIREDATE) 이 '1987/01/01' 이상인 사원만 표시하세요

POST /employee/_search
{
  "query": {
    "range": {
      "hiredate": {
        "gte": "1987-01-01"
      }
    }
  }
}
