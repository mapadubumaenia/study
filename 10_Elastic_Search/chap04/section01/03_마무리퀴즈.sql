-- £ 부서번호(DNO)가 20 및 30 에 속한 (이거나,또는 OR, IN)
-- 사원의 이름(ENAME)과 부서번호(DNO)를 출력하되
-- 이름을 기준으로 내림차순 출력하세요(정렬)


POST /employee/_search
{
  "_source": ["ename","dno"], 
  "query": {
    "terms": {
      "dno": [
        20,
        30
      ]
    }
  },"sort": [
    {
      "ename.keyword": {
        "order": "desc"
      }
    }
  ]
}


-- £ 사원의 급여(SALARY)가 2000 에서 3000 사이에 포함되고
-- 부서번호(DNO)가 20 또는 30 인
-- 사원의 이름(ENAME), 급여와(SALARY) 부서번호를(DNO) 출력하되
-- 이름순(오름차순)으로 표시하세요
POST /employee/_search
{
  "_source": ["ename","salary","dno"], 
  "query": {
    "bool": {
      "must": [
        {"range": {
          "salary": {
            "gte": 2000,
            "lte": 3000
          }
        }},
        {"terms": {
          "dno": [
            20,
            30
          ]
        }}
      ]
    }
  },"sort": [
    {
      "ename.keyword": {
        "order": "asc"
      }
    }
  ]
}


-- £ 1981 년도에 입사한 사원의 이름(ENAME)과 입사일(HIREDATE)을 표시하세요

POST /employee/_search
{
  "_source": ["ename","hiredate"], 
  "query": {
    "range": {
      "hiredate": {
        "gte": "1981-01-01",
        "lte": "1981-12-31"
      }
    }
  }
}


-- £ 관리자가(MANAGER) 없는 사원의 이름(ENAME)과 직위를(JOB) 표시하세요
POST /employee/_search
{
  "_source": ["ename","job","manager"], 
  "query": {
    "bool": {
      "must_not": [
        {"exists": {
          "field": "manager"
        }}
      ]
    }
  }
}


