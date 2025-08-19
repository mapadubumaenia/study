import pandas as pd
from emp import emp_data
df = pd.DataFrame(emp_data)


# 조건: DNO 가 20 이거나 OR JOB 이'MANAGER'인 사원 필터링
a=df.loc[(df["DNO"]==20)|(df["JOB"]=="MANAGER")]
print(a)

# 조건: SALARY < 1000 OR SALARY > 1500
b=df.loc[(df["SALARY"]<1000)|(df["SALARY"]>1500)]
print(b)

