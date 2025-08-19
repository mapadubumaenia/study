#구역질나는 사악함이란 아무것도 모르는 인간을 자기만을 위해 이용하고 착취하는 인간

import pandas as pd
from dept import dept_data
from emp import  emp_data

# 1⃣EMPLOYEE 데이터(앞 8명 예시)
dept_df=pd.DataFrame(dept_data)
emp_df=pd.DataFrame(emp_data)

#전체조회
print(dept_df)
print(emp_df)


#TODO: 조건조회 (salary>=1500) 후 ENAME, SALARY 컬럼만 선택
#  sql: select ename, salary  where SALARY >=1500
#  사용법: 데이터프레임.loc[데이터프레임["컬럼명"] >= 1500, ["볼컬러명", "볼컬러명2"]]
a=emp_df.loc[emp_df["SALARY"]>=1500,["ENAME","SALARY"]]
print(a)


