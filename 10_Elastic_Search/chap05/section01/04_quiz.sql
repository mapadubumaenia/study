-- ② 퀴즈) 부서번호(dno)의 종류가 몇 개인지 출력하기
POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "ddno": {
      "cardinality": {
        "field": "dno"
      }
    }
  }
}


-- 퀴즈: 부서번호가 각 몇번인지, 몇명이 포함되있는지 출력하기
POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "ddno2": {
      "terms": {
        "field": "dno"
      }
    }
  }
}