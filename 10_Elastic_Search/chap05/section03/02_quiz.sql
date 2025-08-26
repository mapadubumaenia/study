POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "gdno": {
     "terms": {
       "field": "dno"
     },"aggs": {
       "gjob": {
        "terms": {
          "field": "job.keyword"
        },"aggs": {
          "avgsalary": {
          "avg": {
            "field": "salary"
          }
          }
        }
       }
     }
    }
  }
}

