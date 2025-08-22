POST /department/_bulk
{ "index": {"_id" : 10} }
{ "dno": 10, "dname": "ACCOUNTING", "loc": "NEW YORK", "insert_time": "2025-07-30T00:00:00", "update_time": null }
{ "index": {"_id" : 20} }
{ "dno": 20, "dname": "RESEARCH", "loc": "DALLAS", "insert_time": "2025-07-30T00:00:00", "update_time": null }
{ "index": {"_id" : 30} }
{ "dno": 30, "dname": "SALES", "loc": "CHICAGO", "insert_time": "2025-07-30T00:00:00", "update_time": null }
{ "index": {"_id" : 40} }
{ "dno": 40, "dname": "OPERATIONS", "loc": "BOSTON", "insert_time": "2025-07-30T00:00:00", "update_time": null }

POST /employee/_bulk
{ "index": {"_id" : 8000 } }
{ "eno": 8000, "ename": "SMITH", "job": "CLERK", "manager": 7902, "hiredate": "1980-12-17", "salary": 800, "commission": null, "dno": 10, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8001 } }
{ "eno": 8001, "ename": "ALLEN", "job": "SALESMAN", "manager": 7698, "hiredate": "1981-02-20", "salary": 1600, "commission": 300, "dno": 30, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8002 } }
{ "eno": 8002, "ename": "WARD", "job": "SALESMAN", "manager": 7698, "hiredate": "1981-02-22", "salary": 1250, "commission": 500, "dno": 30, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8003 } }
{ "eno": 8003, "ename": "JONES", "job": "MANAGER", "manager": 7839, "hiredate": "1981-04-02", "salary": 2975, "commission": null, "dno": 20, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8004 } }
{ "eno": 8004, "ename": "MARTIN", "job": "SALESMAN", "manager": 7698, "hiredate": "1981-09-28", "salary": 1250, "commission": 1400, "dno": 30, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8005 } }
{ "eno": 8005, "ename": "BLAKE", "job": "MANAGER", "manager": 7839, "hiredate": "1981-05-01", "salary": 2850, "commission": null, "dno": 30, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8006 } }
{ "eno": 8006, "ename": "CLARK", "job": "MANAGER", "manager": 7839, "hiredate": "1981-06-09", "salary": 2450, "commission": null, "dno": 10, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8007 } }
{ "eno": 8007, "ename": "SCOTT", "job": "ANALYST", "manager": 7566, "hiredate": "1987-07-13", "salary": 3000, "commission": null, "dno": 20, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8008 } }
{ "eno": 8008, "ename": "KING", "job": "PRESIDENT", "manager": null, "hiredate": "1981-11-17", "salary": 5000, "commission": null, "dno": 10, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8009 } }
{ "eno": 8009, "ename": "TURNER", "job": "SALESMAN", "manager": 7698, "hiredate": "1981-09-08", "salary": 1500, "commission": 0, "dno": 30, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8010 } }
{ "eno": 8010, "ename": "ADAMS", "job": "CLERK", "manager": 7788, "hiredate": "1987-07-13", "salary": 1100, "commission": null, "dno": 20, "insert_time": "2025-07-30", "update_time": null }
{ "index": {"_id" : 8011 } }
{ "eno": 8011, "ename": "JAMES", "job": "CLERK", "manager": 7698, "hiredate": "1981-12-03", "salary": 950, "commission": null, "dno": 30, "insert_time": "2025-07-30", "update_time": null }
{ "index": { "_id" : 8012} }
{ "eno": 8012, "ename": "FORD", "job": "ANALYST", "manager": 7566, "hiredate": "1981-12-03", "salary": 3000, "commission": null, "dno": 20, "insert_time": "2025-07-30", "update_time": null }
{ "index": { "_id" : 8013} }
{ "eno": 8013, "ename": "MILLER", "job": "CLERK", "manager": 7782, "hiredate": "1982-01-23", "salary": 1300, "commission": null, "dno": 10, "insert_time": "2025-07-30", "update_time": null }
