import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터
df = pd.DataFrame(emp_data)


# DNO 가 10 이상 20 이하인 사원 필터링
a=df.loc[df["DNO"].between(10,20)]
print(a)


# HIREDATE 컬럼을 datetime 타입으로 변환
# 1981 년 1 월 1 일부터 1981 년 12 월 31 일 사이 입사한 사원 필터
df["HIREDATE"]=pd.to_datetime(df["HIREDATE"])
b=df.loc[df["HIREDATE"].between("1981-01-01","1981-12-31")]
print(b)
