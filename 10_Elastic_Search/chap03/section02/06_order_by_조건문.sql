-- 예제) 사원(EMPLOYEE) 테이블 내림차순 정렬하기
-- 단, _score(유사도점수) 로 내림차순하고 월급(SALARY)으로 정렬하세요
-- select * from employee
-- order by salary asc, ename desc

--              {
--                 "query": "match_all":{},
--                 "sort": [{"필드":{"order": "asc|desc"},"필드2":{"order": "asc|desc"}}]
--              }


POST /employee/_search
{
  "query": {
    "match_all": {}
  },"sort": [
    {
      "_score": {
        "order": "desc"
      },
            "salary": {
        "order": "asc"
      }
    }
  ]
}