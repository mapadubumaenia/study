
import pandas as pd
from emp import emp_data
df=pd.DataFrame(emp_data)

# 조건: DNO가10이고JOB이'MANAGER'인 사원 필터링
# sql : select * from emp where dno=10 and job='MANAGER'
# TODO 사용법: 데이터프레임.loc[(데이터프레임["컬럼명"]==값) & (데이터프레임["컬럼명"]=="값")]
a=df.loc[(df["DNO"]==10) & (df["JOB"]=="MANAGER")]
print(a)