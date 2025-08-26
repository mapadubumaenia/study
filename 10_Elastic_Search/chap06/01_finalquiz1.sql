-- £ 사원들의 상여금(commission) 합계, 평균, 최소,최고액을 화면에 표시하세요


POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "sumc": {
      "sum": {
        "field": "commission"
      }
    },"maxc": {
      "max": {
        "field": "commission"
      }
    },"minc": {
      "min": {
        "field": "commission"
      }
    },
    "avgc": {
      "avg": {
        "field": "commission"
      }
    }
  }
}


-- £ 상여금(commission) 에서 30%에 해당하는 급여와 70% 해당하는 급여를
-- 표시하세요


POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "pcommi": {
     "percentiles": {
       "field": "commission",
       "percents": [
         30,
         70
       ]
     }
    }
  }
}


-- £ 상여금(commission) 500 단위로 각각 집계해서 표시하세요
POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "hcomi": {
     "histogram": {
       "field": "commission",
       "interval": 500
     }
    }
  }
}



