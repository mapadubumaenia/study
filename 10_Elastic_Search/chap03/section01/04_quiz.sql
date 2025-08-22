-- ② 퀴즈) 부서테이블(DEPARTMENT) 에서 부서번호(DNO) 30 이고, DNAME(부서명) 이
-- SALES 인 부서를 표시하세요


POST /department/_search
{
  "query": {
    "bool": {
      "must": [
        {"term": {
          "dno": {
            "value": 30
          }
        }},
        {"term": {
          "dname.keyword": {
            "value": "SALES"
          }
        }}
      ]
    }
  }
}
