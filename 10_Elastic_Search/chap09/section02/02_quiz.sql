-- ② 퀴즈) emp 인덱스에 여러개 추가하기단, 문서번호는 dno 와 동일하게 추가하세요
POST /emp/_bulk
{ "index": {"_id":20}}
{"eno":8001,"ename":"SMITH","insert_time": "2025-07-30T00:00:00", "update_time": null}
{ "index": {"_id":30} }
{"eno":8002,"ename":"KING","insert_time": "2025-07-30T00:00:00", "update_time": null}


POST /emp/_search
{
  "query": {
    "match_all": {}
  }
}
