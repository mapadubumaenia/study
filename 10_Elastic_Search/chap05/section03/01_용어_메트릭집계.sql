-- TODO: 응용집계(여러가지 집계를 섞어서 하기)
-- £ 용어, 매트릭집계
-- ① 예제) 부서별(DNO) 평균 급여를(SALARY) 부서번호와 함께 화면에 표시하세요
-- select dno, avg(salary) from employee group by dno

-- TODO: 용어집계: aggs -별명 - terms
-- TODO: 매트릭집계: aggs - 별명 - avg
-- TODO: (응용)    : aggs - 별명 - terms
--                                 aggs - 별명 - avg

POST /employee/_search
{
  "size": 0,
  "aggs": {
    "gdno": {
      "terms": {
        "field": "dno"
      },
      "aggs": {
        "tavg": {
          "avg": {
            "field": "salary"
          }
        }
      }
      
    }
  }
}
