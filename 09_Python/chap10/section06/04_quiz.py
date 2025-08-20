import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)
# 직급별 평균 급여 계

b=df.groupby("JOB")["SALARY"].mean()
print(b)