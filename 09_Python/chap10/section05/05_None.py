# 05_None.py
import pandas as pd
from emp import emp_data
df = pd.DataFrame(emp_data)
# NVL과 같은 기능: NaN 또는None을0으로 채우기
# sql: select nvl(COMMISSION,0) from emp
print(df)
# TODO: 사용법: df["별명"]=df["컬럼"].fillna(바꿀값)
df["널채우기"]=df["COMMISSION"].fillna(0)
print(df["널채우기"])
