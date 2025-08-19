import pandas as pd
from emp import emp_data

# 판다스딕셔너리
df=pd.DataFrame(emp_data)

# 조건: DNO가 10이거나 JOB이 "MANAGER" 인 사원 필터링
# TODO: 사용법: 데이터프레임.loc[(데이터프레임["컬럼"]==값)|(데이터프레임["컬럼"]==값)]
a=df.loc[(df["DNO"]==10)|(df["JOB"]=="MANAGER")]
print(a)