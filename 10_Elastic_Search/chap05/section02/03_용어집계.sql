-- TODO: 용어(term) 집계 사용하기
-- TODO: 부정확한 집계 오류가 발생할 가능성이 있습니다.
-- TODO: "shard_size": 숫자(높이면 정확도가 높아짐, 메모리사용량 커짐)
-- TODO: (참고) "doc_count_error_upper_bound": 0 (오차율)
--              "sum_other_doc_count": 0(집계에 사용되지 않은 건수)
-- 예제) 직위(JOB)의 종류가 몇 개인지 출력하기
-- select count(job) from employee group by job
-- TODO: aggs - 별명 - terms
-- TODO: 사용법: POST /인덱스명/_search
--              {
--                 "aggs": {"별명"{: "terms": {"field": "필드.keyword" }}}
--              }
POST /employee/_search
{
  "size": 0,
  "aggs": {
    "tjob": {
      "terms": {
        "field": "job.keyword", "shard_size": 100 
      }
    }
  }
}
