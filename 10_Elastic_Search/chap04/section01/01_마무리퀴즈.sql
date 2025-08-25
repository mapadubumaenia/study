-- £ 사원 테이블에서 JOB 이(직위) 'MANAGER' 인 사원의 데이터를 뽑아서
-- ENAME(사원명)으로 오름차순 정렬하세요

POST /employee/_search
{
  "query": {
    "term": {
      "job.keyword": {
        "value": "MANAGER"
      }
    }
  },"sort": [
    {
      "ename.keyword": {
        "order": "asc"
      }
    }
  ]
}



-- £ 사원테이블에서 JOB 이 'CLERK' 인 사원의 데이터를 뽑아서
-- ENAME(사원명)으로 내림차순 정렬하세요
POST /employee/_search
{
  "query": {
    "term": {
      "job.keyword": {
        "value": "CLERK"
      }
    }
  },"sort": [
    {
      "ename.keyword": {
        "order": "desc"
      }
    }
  ]
}
-- # 여기에 아무말이나 적어도 됨? ㅋㅋ
