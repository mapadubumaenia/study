-- ② 퀴즈) job 별 급여 평균 구합니다. 위의 결과를 모두 더한 총합도 구하기


POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "tjob": {
      "terms": {
        "field": "job.keyword"
      },
      "aggs": {
        "avgsalary": {
          "avg": {
            "field": "salary"
          }
        }
      }
    },
    "total_avg":{
      "sum_bucket": {
        "buckets_path": "tjob>avgsalary"
      }
    }
  }
}