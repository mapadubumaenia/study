import pandas as pd
from dept import dept_data
from emp import emp_data
dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)
# 조건: DNO == 30 AND DNAME == 'SALES'
# 2) 급여(SALARY)가 1000 이상 1500 이하인 사원 조회
# 조건: SALARY >= 1000 AND SALARY <= 1500


# 조건: DNO == 30 AND DNAME == 'SALES'
a=dept_df.loc[(dept_df["DNO"]==30)&(dept_df["DNAME"]=="SALES")]
print(a)

# 2) 급여(SALARY)가 1000 이상 1500 이하인 사원 조회
# 조건: SALARY >= 1000 AND SALARY <= 1500
b=emp_df.loc[(emp_df["SALARY"]>=1000)&(emp_df["SALARY"]<=1500)]
print(b)