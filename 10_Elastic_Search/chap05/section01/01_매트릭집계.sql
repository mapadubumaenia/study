-- TODO: 매트릭 집계
-- 예제) 사원들의 급여(SALARY) 총액, 최고액을 화면에 표시하세요
-- select sum(salary) as tsum, max(salary) as tmax from employee
-- 그룹함수: sum, max, min, avg, count
-- TODO: aggs - 별명 -  sum - field: 필드명
-- TODO: size: 0 - 검색된 문서 출력X, 집계 결과만 출력
POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "tsum": {
      "sum": {
        "field": "salary"
      }
    },
    "tmax": {
      "max": {
        "field": "salary"
      }
    }
  }
}




