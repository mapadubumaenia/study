

-- 02_용어_매트릭집계_정렬.sql
-- 예제) 부서별(DNO) 총 급여를(SALARY) 부서번호와 함께 화면에 표시하세요
-- 단, 부서번호별로 정렬하세요
-- select dno, sum(salary) as tsum from employee group by dno
-- order by dno asc
-- TODO: (응용)    : aggs - 별명 - terms(order 정렬 옵션)
-- TODO:                         - aggs - 별명 - sum

POST /employee/_search
{
  "size": 0, 
  "aggs": {
    "gdno": {
      "terms": {
        "field": "dno","order": {
          "_key": "asc"
        }
      },"aggs": {
        "byjob": {
         "terms": {
           "field": "job.keyword"
         },
         "aggs": {
           "sumsalary": {
             "sum": {
               "field": "salary"
             }
           }
         }
        }
      }
    }
  }
}
