# 02_퀴즈.py
import pandas as pd
from emp import emp_data

# 1️⃣ EMPLOYEE 데이터 (앞 8명 예시)
df = pd.DataFrame(emp_data)



# 1) DNO가 10 또는 20인 행 필터링
# select * from emp where dno in (10,20)
a=df.loc[df["DNO"].isin([10,20])]
print(a)

# 2) DNO가 10 또는 20이 아닌 행 필터링
# select * from emp where dno not in (10,20)
b=df.loc[~df["DNO"].isin([10,20])]
print(b)