import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터
df = pd.DataFrame(emp_data)
# 가장 오래된 입사일 구하

df["HIREDATE"] = pd.to_datetime(df["HIREDATE"])

a=df["HIREDATE"].min()
print(a)


b=df.sort_values("HIREDATE")
print(b[["HIREDATE","ENAME"]])