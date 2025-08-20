
import pandas as pd
from emp import emp_data
# 1 ⃣EMPLOYEE 데이터(앞8명 예시)
df = pd.DataFrame(emp_data)

# ENAME 문자열 길이 구하기
# sql: select length(ename) as 길이 from emp
# TODO: 사용법: df["별명"]=df["컬럼"].str.len()
df["길이"]=df["ENAME"].str.len()
# print(df["길이"])
print(df[["ENAME", "길이"]])
