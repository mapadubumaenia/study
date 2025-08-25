-- 예제) 이름이(ENAME) 'F' 로 시작하는 사원 조회하기
-- select * from employee
-- where ename like 'F%'
-- TODO: query - wildcard - (글자) 필드.keyword - 글자*
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "wildcard":{"필드.keyword": "글자*"}
--              }
POST /employee/_search
{
  "query": {
    "wildcard": {
      "ename.keyword": {
        "value": "F*"
      }
    }
  }
}

-- 예제) 이름의 두번째 글자가 'A' 인 사원 조회하기
-- select * from employee
-- where ename like '_A%'
-- _(?) : 어떤 1글자
-- %(*) : 아무 글자들
-- TODO: query - wildcard - (글자) 필드.keyword - ?글자*
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "wildcard":{"필드.keyword": "?글자*"}
--              }
POST /employee/_search
{
  "query": {
    "wildcard": {
      "ename.keyword": {
        "value": "?A*"
      }
    }
  }
}