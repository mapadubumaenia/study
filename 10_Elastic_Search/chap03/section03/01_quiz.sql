-- ② 퀴즈) KING 사원을 조회하세요, 단 match(전문 검색, 자연어검색)을 이용하세요

POST /employee/_search
{
  "query": {
    "match": {
      "ename": "KING"
    }
  }
}


-- ④ 퀴즈) job 이 "SALESMAN" 인 사원을 조회하세요, 단 match(전문 검색, 자연어검색)을
-- 이용하세요


POST /employee/_search
{
  "query": {
    "match": {
      "job": "SALESMAN"
    }
  }
}


-- ⑥ 퀴즈) dname 이 "RESEARCH" 인 부서을 조회하세요, 단 match(전문 검색, 자연어검색)
-- 을 이용하세요

POST /department/_search
{
  "query": {
    "match": {
      "dname": "RESEARCH"
    }
  }
}