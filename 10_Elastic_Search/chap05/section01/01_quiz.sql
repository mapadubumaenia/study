-- ② 퀴즈) 사원들의 급여(SALARY) 평균, 최소액을 화면에 표시하세요

POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "tavg": {
      "avg": {
        "field": "salary"
      }
    },
    "tmin": {
      "min": {
        "field": "salary"
      }
    }
  }
}
