import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 부서별 평균 급여 계산
# TODO 사용법: 변수.groupby("컬럼")["컬럼2"].mean()
a=df.groupby("DNO")["SALARY"].mean()
print(a)