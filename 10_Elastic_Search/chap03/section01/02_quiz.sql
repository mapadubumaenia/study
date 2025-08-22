-- ② 퀴즈) 사원명(ENAME) 이 ALLEN 인 사원의 정보를 출력하세요



POST /employee/_search
{
  "query": {
    "term": {
      "ename.keyword": {
        "value": "ALLEN"
      }
    }
  }
}



-- ③ 퀴즈) JOB(직위) 이 CLERK 인 사원을 출력하세요

POST /employee/_search
{
  "query": {
    "term": {
      "job.keyword": {
        "value": "CLERK"
      }
    }
  }
}

