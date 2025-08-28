-- ② 퀴즈) ALLEN 사원보다 급여를(SALARY) 많이 받는 사원이 누구인지 표시하세요


-- ② 퀴즈) ALLEN 사원보다 급여를(SALARY) 많이 받는 사원이 누구인지 표시하세요
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


POST /employee/_search
{
 
  "query": {
    "range": {
      "salary": {
        "gt": 1600

      }
    }
  }
}
