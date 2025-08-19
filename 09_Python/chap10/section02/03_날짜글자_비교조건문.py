import pandas as pd
from emp import emp_data

# TODO:판다스딕셔너리(데이터프레임)
df=pd.DataFrame(emp_data)

# HIREDATE 컬럼을 날자(datetime) 타입으로 변환
#  TODO: 사용법  판다스.to_datetime(데이터프레임["컬럼명"])
df["HIREDATE"]=pd.to_datetime(df["HIREDATE"])

# 조건: HIREDATE가 1981-01-01 이전 또는 같은 날짜인 행 선택
a=df.loc[df["HIREDATE"]<="1981-01-01"]
print(a)