-- ② 퀴즈) 사원테이블(EMPLOYEE)에 MANAGER(관리자) 컬럼이 있습니다. 관리자가(MANAGER) 없는 사원을 표시하세요

POST /employee/_search
{
  "query": {
    "bool": {
      "must_not": [
        {"exists": {
          "field": "manager"
        }}
      ]
    }
  }
}
