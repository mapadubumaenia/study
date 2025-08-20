import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)
# ENAME 첫 2

a=df["JOB"].str[0:2]
print(a)