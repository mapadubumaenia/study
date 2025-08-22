-- ③ 퀴즈) 부서테이블에서 DNO(부서번호) 가 20 보다 큰 부서만 표시하세요

POST /department/_search
{
  "_source": ["dname","dno"],
  "query": {
    "range": {
      "dno": {
        "gte": 20
      }
    }
  }
}


-- ④ 퀴즈) 급여가(SALARY) 1000 과 1500 사이의 사원 조회하기
POST /employee/_search
{
  "_source": ["ename","salary"],
  "query": {
    "range": {
      "salary": {
        "gte": 1000,
        "lte": 1500
      }
    }
  }
}

-- ⑤ 퀴즈) 사원 테이블에서 DNO(부서번호) 10 인 사원을 찾아 전체 출력하세요
POST /employee/_search
{
  "_source": ["*"],
  "query": {
    "term": {
      "dno": {
        "value": 10
      }
    }
  }
}



-- ⑥ 퀴즈) 사원테이블에서 월급이 5000 인 사람의 이름을 출력하세요


POST /employee/_search
{
  "_source": ["ename"],
  "query": {
    "term": {
      "salary": {
        "value": 5000
      }
    }
  }
}



