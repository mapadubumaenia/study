-- ② 퀴즈) 부서번호의 종류가 몇 개인지 출력하기POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "hdno": {
     "terms": {
       "field": "dno" ,"shard_size": 100
     }
    }
  }
}




