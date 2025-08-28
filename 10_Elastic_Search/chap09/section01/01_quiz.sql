GET /employee/_mapping


PUT /emp
{
  "mappings": {
    "properties": {
      "eno":{"type": "integer"},
      "ename":{"type": "text",
        "fields": {"keyword":{"type":"keyword"}}
      },
      "insert_time":{"type": "date"},
      "update_time":{"type": "date"}
    }
  }
}


GET /emp/_mapping
