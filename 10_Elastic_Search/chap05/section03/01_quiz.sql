-- ② 퀴즈) 직위별(JOB) 평균 급여를 화면에 표시하세요


POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "tjob": {
     "terms": {
       "field": "job.keyword"
     },"aggs": {
       "asalary": {
        "avg": {
          "field": "salary"
        }
       }
     }
    }
  }
}


