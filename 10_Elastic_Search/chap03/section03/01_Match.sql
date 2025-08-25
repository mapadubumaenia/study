-- 예제) SCOTT 사원을 조회하세요, 
-- 단 match(전문 검색, 자연어검색)을 이용하세요
-- 유사도 점수에 따라서 높은것이 먼저 보입니다.
--  (유사도 점수 내림차순 정렬이 기본입니다.)
-- select * from employee
-- where ename='SCOTT'
-- 키워드 검색(term - .keyword) vs 자연어검색(match, (성능높음))

-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "match":{"필드": "값"}
--              }

-- TODO: 유사도 점수가 정밀하게 계산됨: 자연어(전문,문장) 검색
-- TODO: 내부적으로 문장을 형태소(명사,동사,형용사 등)로 분해해서 검색된다.

POST /employee/_search
{
  "query": {
    "match": {
      "ename": "SCOTT"
    }
  }
}



-- ③ 예제) job 이 "CLERK" 인 사원을 조회하세요, 단 match(전문 검색, 자연어검색)을 이용하
-- 세요

POST /employee/_search
{
  "query": {
    "match": {
      "job": "CLERK"
    }
  }
}


-- ⑤ 예제) dname 이 "sales" 인 부서을 조회하세요, 단 match(전문 검색, 자연어검색)을 이용
-- 하세요

POST /department/_search
{
  "query": {
    "match": {
      "dname": "sales"
    }
  }
}

