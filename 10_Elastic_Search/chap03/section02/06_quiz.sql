-- ⑥ 퀴즈) 사원테이/블에서(EMPLOYEE) 급여는(SALARY) 내림차순으로 정렬하세요
-- 단, _sroce(유사도점수) 로 내림차순하고 사원명에 대해(ENAME) 추가로 오름차순으로
-- 정렬하세요


POST /employee/_search
{
  "query": {
    "match_all": {}
  },"sort": [
    {
      "_score": {
        "order": "desc"
      },
      "ename.keyword": {
        "order": "asc"
      }
    }
  ]
}



