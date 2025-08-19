import pandas as pd
from emp import emp_data
# 1) 사원명(ENAME)이'ALLEN'인 사원 전체 정보 출력
# ENAME 이'ALLEN'인 사원 전체 정보 조회
# 2) 직위(JOB)가'CLERK'인 사원 전체 정보 출력
# JOB 이'CLERK'인 사원 전체 정보 조회
df=pd.DataFrame(emp_data)

# 1) 사원명(ENAME)이'ALLEN'인 사원 전체 정보 출력
# ENAME 이'ALLEN'인 사원 전체 정보 조회
a=df.loc[df["ENAME"]=="ALLEN"]
print(a)

# 2) 직위(JOB)가'CLERK'인 사원 전체 정보 출력
# JOB 이'CLERK'인 사원 전체 정보 조회
b=df.loc[df["JOB"]=="CLERK"]
print(b)