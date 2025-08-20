# 04_글자자르기.py
import pandas as pd
from emp import emp_data
# 1 ⃣EMPLOYEE 데이터(앞8명 예시)
df = pd.DataFrame(emp_data)

# ENAME에서 첫2글자 추출(인덱스0부터2 미만)
# sql: select substr(ename,0,2) as 자름 from emp
# TODO: 사용법: df["별명"]=df["컬럼"].str[시작:끝]
a=df["ENAME"].str[0:2]
print(a)