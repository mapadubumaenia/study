-- ② 퀴즈) employee 를 단일 행 조회해 봅니다.


POST /employee/_search
{
   "query": {"match_all": {}}
}

GET /employee/_doc/8000