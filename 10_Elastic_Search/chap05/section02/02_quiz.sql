-- ② 퀴즈) 급여를(SALARY) 0~1000, 1000~5000 단위로 각각 집계해서 표시하세요

POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "psalary": {
      "range": {
        "field": "salary",
        "ranges": [
          {
            "from": 0,
            "to": 1000
          },{
            "from": 1000,
            "to": 5000
          }
        ]
      }
    }
  }
}