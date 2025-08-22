-- 예제) 사원명(ENAME) 이 SCOTT 인 사원의 정보를 출력하세요
-- TODO: 정확하게 일치 조회(글자): query - term -필드.keyword
-- select * from employee where ename='SCOTT'
-- TODO 사용법: POST /인덱스명/_search
--                   {
--                    "query": {"term": {"필드명.keyword": {"value": "값"}}}
--                      }
-- 


POST /employee/_search
{
  "query": {
    "term": {
      "ename.keyword": {
        "value": "SCOTT"
      }
    }
  }
}