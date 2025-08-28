-- ② 퀴즈) 부서번호 간격을 10 씩 가지는 히스토집계를 낸 후 각 구간별로 job 별(용어) 집계를
-- 구하세요


POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "hdno": {
      "histogram": {
        "field": "dno",
        "interval": 10
      },
      "aggs": {
        "tjob": {
          "terms": {
            "field": "job.keyword"
          }
        }
      }
    }
  }
}
