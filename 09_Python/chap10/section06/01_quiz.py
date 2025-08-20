import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)
# 평균 급여 구하고 반올림
# 최솟값 구하

a=df["SALARY"].mean()
print(a.round(0))

b=df["SALARY"].min()
print(b)

