-- 04_ORDER_BY.sql
-- 예제) 사원(EMPLOYEE) 인덱스(테이블) 오름차순 정렬하기
-- 단, 월급(SALARY)으로 정렬하세요
-- select * from employee
-- order by salary asc
-- TODO: query - match_all
-- TODO: sort - 필드: {"order": "asc"}
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "query": "match_all":{},
--                 "sort": [{"필드":{"order": "asc|desc"}}]
--              }
-- TODO: 예약어 설명: _score(유사도 점수)
-- TODO:             _id(기본키 의미, 유일값)
-- TODO:             _index(인덱스명)
-- TODO:             _source(데이터)
-- TODO:             total - value: 총건수
--      기본정렬: 유사도점수 높은순 내림차순
--      예) 네이버: 가장 유사한 문서부터 보이줌
--  (참고) tf-idf 알고리즘 개선한 BM25 알고리즘 사용
--  (용어설명) tf(term frequency)-idf(inverse document frequency): 
--         tf(1페이지 내에서 특정 단어 자주 발생하면 점수 낮춤: 예) 그리고, 또는 등)
--         idf(모든 문서에서 특정 단어가 빈번하게 나오면 높임 : 예) 열정, 성공 빈번하게 나옴)
POST /employee/_search
{
  "query": {
    "match_all": {}
  },
  "sort": [
    {
      "salary": {
        "order": "asc"
      }
    }
  ]
}


-- ③ 예제) 사원(EMPLOYEE) 테이블 내림차순 정렬하기
-- 단, 월급(SALARY)으로 정렬하세요
POST /employee/_search
{
  "query": {
    "match_all": {}
  },
  "sort": [
    {
      "salary": {
        "order": "desc"
      }
    }
  ]
}

