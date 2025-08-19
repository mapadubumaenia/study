# 01_대소문자.py
import pandas as pd
from emp import emp_data
# 1 ⃣EMPLOYEE 데이터(앞8명 예시)
df = pd.DataFrame(emp_data)

# 대문자 변환
# sql: select upper(ename) as 대문자 from emp
# TODO; 사용법: df["별명"]=df["컬럼명"].str.upper()
df["EUPPER"]=df["ENAME"].str.upper()
print(df["EUPPER"])
# 소문자 변환
# sql: select lower(ename) as 소문자 from emp
# TODO; 사용법: df["별명"]=df["컬럼명"].str.lower()
df["ELOWER"]=df["ENAME"].str.lower()
print(df["ELOWER"])



# 첫 글자만 대문자(INITCAP
df["Upper"]=df["ENAME"].str.title()
print(df["Upper"])

# 모두보기
print(df[["EUPPER","ELOWER","Upper"]])