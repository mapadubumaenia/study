import pandas as pd
from dept import dept_data
from emp import emp_data
# 1⃣EMPLOYEE 데이터
dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)


# 1. 'ACCOUNTING' 의 부서 번호(DNO) 조회
a=dept_df.loc[dept_df["DNAME"]=="ACCOUNTING","DNO"]
print(a)

# 2. DNO 가 ACCOUNTING 인 사원의 ENAME, SALARY 조회
b=emp_df.loc[emp_df["DNO"].isin(a),["ENAME","SALARY"]]
print(b)