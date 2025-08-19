import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 대문자 변환
df["JUPPER"]=df["JOB"].str.upper()
print(df["JUPPER"])


# 소문자 변환
df["jlower"]=df["JOB"].str.lower()
print(df["jlower"])




# 첫 글자만 대문자(INITCAP
df["Jtitle"]=df["JOB"].str.title()
print(df["Jtitle"])

#all
print(df[["JUPPER","jlower","Jtitle"]])