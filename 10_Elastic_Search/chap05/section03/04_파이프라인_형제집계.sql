-- TODO: 파이프라인 형제 집계 하기
-- 예제) 부서별 급여 합계 구합니다.(group by dno)  
-- 위에서 구한 부서별 급여합계를 모두 더한 총합도 구합니다.
-- TODO: 파이프라인 집계 의미: 1) 최초 각 집계를 구합니다.(매트릭집계:sum, avg 등)
--                           2)  위의 결과를 이용해서 다시 집계를 내는 방식 
-- TODO: 예) 개발부 급여합계: 1000, 영업부 급여합계: 500
-- TODO:     위의 결과 이용: 1000 + 500 => 총급여 구함(파이프라인 집계)
-- select sum(salary) from employee
-- group by dno
-- TODO: aggs - 별명 - terms : dno(부서별 용어 집계)
-- TODO:               aggs - 별명 - sum: salary(매트릭 집계)
-- TODO:        별명 - sum_bucket - "buckets_path": "부모별명>자식별명"
-- TODO: 자동집계 파이프라인 예약어: sum_bucket(총합), avg_bucket(평균), ...
POST /employee/_search
{
  "size": 0,
  "aggs": {
    "tdno": {
      "terms": {
        "field": "dno"
      },
      "aggs": {
        "ssalary": {
          "sum": {
            "field": "salary"
          }
        }
      }
    },
    "tsum":{
      "sum_bucket": {
        "buckets_path": "tdno>ssalary"
      }
    }
  }
}