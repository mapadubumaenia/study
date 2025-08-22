-- select ename, salary from employee
-- where salary >= 1500

-- TODO: 숫자 범위 조건문:query-range
-- TODO gte: greater than or equal to
-- TODO lte: less than or equal to
-- TODO gt: greater than
-- TODO lt: less than
POST /employee/_search
{
  "_source": ["ename","salary"],
  "query": {
    "range": {
      "salary": {
        "gte": 1500
      }
    }
  }
}




-- TODO 2)정확히 일치하는 값 조회:

POST /employee/_search
{
  "_source": ["ename","salary"],
  "query": {
    "term": {
      "salary": {
        "value": 1500
      }
    }
  }
}
