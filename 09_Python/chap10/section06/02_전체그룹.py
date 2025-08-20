import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 문자열을 datetime 타입으로 변환
df["HIREDATE"] = pd.to_datetime(df["HIREDATE"])


# 가장 최근 입사일 구하기
# sql: select max(HIREDATE) AS 최근일 from emp
max_hiredate=df["HIREDATE"].max()
print(max_hiredate)
