import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# SALARY 가 1000 이상 1500 이하인 행 필터링(BETWEEN 포함 범위)
# sql:select * from emp where salary between 1000 and 1500
# TODO 사용법: df.loc[df["컬럼명"].between(시작값,끝값)]
a=df.loc[df["SALARY"].between(1000,1500)]
print(a)

# SALARY 가 1000 이상 1500 이하가 아닌 사원 필터링(NOT BETWEEN
# TODO 사용법: df.loc[~df["컬럼명"].between(시작값,끝값)]   => not 사용법  ~()
b=df.loc[~df["SALARY"].between(1000,1500)]
print(b)