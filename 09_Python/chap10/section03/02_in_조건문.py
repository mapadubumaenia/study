import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 조건: COMMISSION 이 300, 500, 1400 중 하나인 행 필터링
# TODO: 사용법: 변수.loc[변수["컬럼"].isin([값1,값2,값3])]
a=df.loc[df["COMMISSION"].isin([300,500,1400])]
print(a)


# COMMISSION 이 300, 500, 1400 이 아닌 값 필터링
#  TODO: 사용법: 변수.loc[~변수["컬럼"].isin([값1,값2,값3])]
b=df.loc[~df["COMMISSION"].isin([300,500,1400])]
print(b)
# NaN 포함하려면 fillna 사용하거나 isna() 조건 추가 필요