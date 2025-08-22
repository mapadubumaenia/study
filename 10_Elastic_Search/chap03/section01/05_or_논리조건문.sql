-- ① 예제) 부서 번호가(DNO) 10 이거나 또는 직급이(JOB) 'MANAGER' 인 사원만 출력하기
-- select * from employee where dno = 10 or job = 'MANAGER';
-- must = AND (필수 조건)  영어 의미: "반드시 해야 한다", "꼭 충족해야 한다".
-- should = OR (선택 조건) 영어 의미: "하는 것이 좋다", "하면 더 좋다", "선택 사항".

-- TODO: query - bool - should(or, 또는) - term
-- 정확히일치: term(=)
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "bool":{"should": [{"term":{필드:값}},{"term":{필드:값}}]}


POST /employee/_search
{
  "query": {
    "bool": {
      "should": [
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
