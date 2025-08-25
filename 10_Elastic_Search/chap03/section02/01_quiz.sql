-- ① 퀴즈) 부서번호가(DNO) 10 이거나 20 인 사원들 화면에 표시하세요

-- select * from employee where dno = 10 or dno = 20;


POST /employee/_search
{
  "query": {
    "terms": {
      "dno": [
        10,
        20
      ]
    }
  }
}







-- ② 퀴즈) 부서번호가(DNO) 10 과 20 이 아닌 사원들 화면에 표시하세요
-- select * from employee where not (dno = 10 or dno = 20);

POST /employee/_search
{
  "query": {
    "bool": {
      "must_not": [
        {"terms": {
          "dno": [
            10,
            20
          ]
        }}
      ]
    }
  }
}