-- 04_그룹핑해서_세기.sql
-- 예제) 직위(JOB)의 종류가 몇 개인지 출력하기
-- select count(distinct job) from employee
-- select count(job) from employee group by job
-- TODO: aggs - 별명 - cardinality - field: 글자.keyword
-- TODO: 글자: 1) 키워드검색(집계, 정렬 o) 2) 자연어검색(집계, 정렬 x)
-- TODO: 사용법: POST /인덱스명/_count
--              {
--                 "aggs": {"djob": {cardinality: {"field": "필드.keyword"}}}
--              }
-- 1)
POST /employee/_search
{
  "size": 0,
  "aggs": {
    "djob": {
      "cardinality": {
        "field": "job.keyword"
      }
    }
  }
}

-- 2) 용어집계

POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "djob2": {
      "terms": {
        "field": "job.keyword"
      }
    }
  }
}