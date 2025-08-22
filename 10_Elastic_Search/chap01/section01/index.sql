DELETE /department
DELETE /employee

PUT /department
{
  "mappings": {
    "properties": {
      "dno":         { "type": "integer" },
      "dname": {
        "type": "text",
        "fields": {"keyword": { "type": "keyword" }}
      },
      "loc": {
        "type": "text",
        "fields": {"keyword": { "type": "keyword" }}
      },
      "insert_time": { "type": "date" },
      "update_time": { "type": "date" }
    }
  }
}


PUT /employee
{
  "mappings": {
    "properties": {
      "eno":         { "type": "integer" },
      "ename": {
        "type": "text",
        "fields": {"keyword": { "type": "keyword" }}
      },
      "job": {
        "type": "text",
        "fields": {"keyword": { "type": "keyword" }}
      },
      "manager":     { "type": "integer" },
      "hiredate":    { "type": "date" },
      "salary":      { "type": "integer" },
      "commission":  { "type": "integer" },
      "dno":         { "type": "integer" },
      "insert_time": { "type": "date" },
      "update_time": { "type": "date" }
    }
  }
}


