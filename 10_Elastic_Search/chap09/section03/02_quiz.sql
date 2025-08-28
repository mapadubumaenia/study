-- ② 퀴즈) emp 첫번째 문서 여러 데이터 수정하기② 퀴즈) emp 첫번째 문서 여러 데이터 수정하기

-- 먼저 employeee 에 한명 데이터 찾은뒤
POST /employee/_search
{
  "size": 20, 
  "query": {
    "match_all": {}
  }
}

-- 8003 사원번호를 가진 문서의 eno, ename, job, manager 필드값을 각각 8888, MAFA, BAEKSOO, 8000 으로 수정하세요
POST /employee/_update/8003
{
  "doc": {
    "eno":8888,
    "ename":"MAFA",
    "job":"BAEKSOO",
    "manager":8000
  }
}

