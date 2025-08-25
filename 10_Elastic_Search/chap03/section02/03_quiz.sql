-- 퀴즈) 이름에(ENAME) 'M' 으로 시작하는 사원 조회하기
-- select * from employee
-- where ename like 'M%'
-- query - wildcard - (글자) 필드.keyword
POST /employee/_search
{
  "query": {
    "wildcard": {
      "ename.keyword": {
        "value": "M*"
      }
    }
  }
}


-- ④ 퀴즈) 이름의 두번째 글자가 'O' 인 사원 조회하기

POST /employee/_search
{
  "query": {
    "wildcard": {
      "ename.keyword": {
        "value": "?O*"
      }
    }
  }
}
