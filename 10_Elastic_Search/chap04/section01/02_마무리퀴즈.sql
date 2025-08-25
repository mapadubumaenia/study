-- £ 급여가(SALARY) 2000 을 넘는 사원의 이름과(ENAME) 급여를
-- 급여가 많은 것부터 작은 순으로 출력하세요(내림차순)


POST /employee/_search
{
  "_source": ["salary","ename"], 
  "query": {
    "range": {
      "salary": {
        "gt": 2000
      }
    }
  },"sort": [
    {
      "salary": {
        "order": "desc"
      }
    }
  ]
}


-- £ 사원번호가(ENO) 8000 인 사원의 이름과(ENAME)
-- 부서번호를(DNO) 표시하세요
POST /employee/_search
{
  "_source": ["ename","dno"], 
  "query": {
    "term": {
      "eno": {
        "value": 8000
      }
    }
  }
}


-- £ 급여가(SALARY) 2000 에서 3000 사이에 포함되지 않는
-- 사원의 이름과(ENAME) 급여를 표시하세요.
POST /employee/_search
{
  "_source": ["ename","salary"], 
  "query": {
    "bool": {
      "must_not": [
        {"range": {
          "salary": {
            "gte": 2000,
            "lte": 3000
          }
        }}
      ]
    }
  }
}

-- £ 1981 년 2 월 20 일 부터 1981 년 5 월 1 일 사이에 입사한 사원의
-- 이름(ENAME), 직위(JOB), 입사일(HIREDATE)을 표시하세요

POST /employee/_search
{
  "_source": ["ename","job","hiredate"], 
  "query": {
    "bool": {
      "must": [
        {"range": {
          "hiredate": {
            "gte": "1981-02-20",
            "lte": "1981-05-01"
          }
        }}
      ]
    }
  }
}



