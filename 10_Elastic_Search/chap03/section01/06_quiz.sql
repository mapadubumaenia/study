-- ② 퀴즈) 부서테이블(DEPARTMENT)에서 20 번 부서번호(DNO)가 아닌 부서를 모두 표시
-- 하세요
-- select * from department where not dno = 20;


POST /department/_search
{
  "query": {
    "bool": {
      "must_not": [
        {"term": {
          "dno": {
            "value": 20
          }
        }}
      ]
    }
  }
}