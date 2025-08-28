
-- £ 테이블에 데이터 수정하기
-- ① 예제) DEPT 테이블에 데이터를 수정하세요
-- 단, 20 번 부서의 부서명을 연구소로 수정하세요

--기본키 20번 데이터 조회
POST /department/_search
{
  "query": {
    "match_all": {}
  }
}



--문서번호(기본키)로 일부 필드만 수정
-- TODO: doc= 필드:값
POST /department/_update/20
{
  "doc": {
    "dname":"개발부"
  }
}


