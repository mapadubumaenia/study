import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# COMMISSION 이 NULL (NaN) 인 행 필터링
# sql : select * from emp where commission is null
# TODO: 사용법: 변수.loc[변수["컬럼명"].isna()]
a=df.loc[df["COMMISSION"].isna()]
print(a)


# COMMISSION 이 NULL 이 아닌 행 필터
# sql : select * from emp where commission is not null
# TODO: 사용법: 변수.loc[변수["컬럼명"].notna()]
b=df.loc[df["COMMISSION"].notna()]
print(b)