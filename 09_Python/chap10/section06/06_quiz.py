import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 직급별 급여 합계 계산
a=df.groupby("JOB")["SALARY"].sum().reset_index()
print(a)


# HAVING 조건(급여 합계 5000 이상 필터링)
b=a.loc[a["SALARY"]>=5000]
print(b)
