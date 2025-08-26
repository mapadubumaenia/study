-- 예제) dname 이 "ACCOUNTING" 인 부서를 조회하세요, 단 match_phrase(전문 검색, 
-- 자연어검색)을 이용하세요
-- select * from department
-- where dname='ACCOUNTING'
-- TODO: query - match_phrase
-- TODO: 자연어검색: 대소문자 관계없음
POST /department/_search
{
  "query": {
    "match_phrase": {
      "dname": "accounting"
    }
  }
}



-- ③ 예제) job 이 "MANAGER" 인 사원을 조회하세요, 단 match_phrase(전문 검색, 자연어
-- 검색)을 이용하세요


POST /employee/_search
{
  "query": {
    "match_phrase": {
      "job": "MANAGER"
    }
  }
}

-- ⑤ 예제) dname 이 "ACCOUNTING" 인 사원을 조회하세요, 단 match_phrase(전문 검색, 자연어검색)을 이용하세요

POST /department/_search
{
  "query": {
    "match_phrase": {
      "dname": "ACCOUNTING"
    }
  }
}
