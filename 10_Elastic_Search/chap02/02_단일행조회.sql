-- TODO: 단일행조회: GET 방식
-- 기본키 => ES에서는 (문서번호:) 라고 부름


-- TODO 1)전체조회: 문서번호 확인(_id값)
GET /department/_search
{
   "query": {
      "match_all": {}
   }
}

-- TODO 2)단일행조회: 문서번호로 조회
-- 사용법: GET /인덱스명/_doc/문서번호
-- 참고) 문서번호가 기본키에 해당함
GET /department/_doc/10     -- 단일행조회(문서번호를 알아야 가능)