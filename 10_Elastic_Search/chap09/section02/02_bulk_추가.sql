-- 02_bulk_추가.sql
-- TODO: 한방에 여러개 추가
-- 예제) dept 인덱스에 여러개 추가하기
-- 단, 문서번호는 dno와 동일하게 추가하세요
-- 사용법:
-- POST /인덱스명/_bulk
-- {"index": {"_id":숫자}}  -- 기본키생략: 자동생성, 지정도 가능 
-- {"필드":값, "필드2":값2,...}
-- ...

POST /dept/_bulk
{ "index": {"_id":20} }
{ "dno": 20, "dname": "RESEARCH", "loc": "DALLAS", "insert_time": "2025-07-30T00:00:00", "update_time": null }
{ "index": {"_id":30} }
{ "dno": 30, "dname": "SALES", "loc": "CHICAGO", "insert_time": "2025-07-30T00:00:00", "update_time": null }
