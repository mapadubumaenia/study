import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)
# 'Oracle '과 ENAME 문자열 붙이

df["붙임"]='Oracle '+df["JOB"]
print(df["붙임"])