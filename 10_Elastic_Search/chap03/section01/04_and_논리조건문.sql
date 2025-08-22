-- ① 예제) 부서 번호(DNO) 가 10 이고 직급이(JOB) 'MANAGER' 사원을 출력하세요

-- SELECT *FROM EMPLOYEE WHERE DNO = 10 AND JOB = 'MANAGER';
-- query - bool -must(and)
-- TODO: 정확조회: term
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "bool":{"must": [{"term":{필드:값}},{{"term":{필드:값}}}]}
--              }

POST /employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"term": {
          "dno": {
            "value": 10
          }
        }},
        {"term": {
          "job.keyword": {
            "value": "MANAGER"
          }
        }}
      ]
    }
  }
}