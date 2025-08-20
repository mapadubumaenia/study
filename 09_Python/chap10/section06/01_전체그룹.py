import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)
# 급여 총합과 최고액 계산
# 결과 출력

# 급여 총합과 최고액 계산
# TODO 사용법: 변수=df["컬럼"].sum()
#   집계함수:sum(), max(), min(), mean()
a=df["SALARY"].sum()
b=df["SALARY"].max()
print(a,b)