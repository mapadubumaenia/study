-- ② 퀴즈) salary 에서 25%에 해당하는 급여, 50%, 75% 해당하는 급여를 표시하세요

POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "psalary": {
      "percentiles": {
        "field": "salary",
        "percents": [
          25,
          50,
          75
        ]
      }
    }
  }
}
