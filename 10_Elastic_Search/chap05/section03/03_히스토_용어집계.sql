-- 예제) 부서번호 간격을 20씩 가지는 히스토집계를 낸 후 각 구간별로 job 별(용어) 집계를 
-- 구하세요
-- TODO: 히스토그램: aggs - 별명 - histogram(먼저 1)              : dno
-- TODO: 용어      :              aggs - 별명 - terms(나중에 2)   : job

POST /employee/_search
{
  "size": 0,
  "aggs": {
    "hdno": {
      "histogram": {
        "field": "dno",
        "interval": 20
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