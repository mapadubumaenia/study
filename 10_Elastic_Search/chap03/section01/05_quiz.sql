-- ② 퀴즈) 부서 번호가(DNO) 20 이거나 직급이(JOB) 'MANAGER' 인 사원만 표시하세요



POST /employee/_search
{
  "query": {
    "bool": {
      "should": [
        {"term": {
          "dno": {
            "value": 20
          }
        }},
        {"term": {
          "job.keyword": {
            "value": "MANAGER"
          }
        }}
      ]
    }
  }
}
