import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)
# JOB 문자열 길이 구하

df["길이"]=df["JOB"].str.len()
print(df[["JOB","길이"]])