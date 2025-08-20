import pandas as pd
from dept import dept_data
from emp import emp_data
# 1⃣EMPLOYEE 데이터
dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)



# 1. INNER JOIN (EMPLOYEE.DNO = DEPARTMENT.DNO)
# select e.*, d.* from emp e, dept d where e.dno=d.dno
# TODO: 변수=판다스.merge(emp_df, dept_df, on="공통컬럼", how="inner")
a=pd.merge(dept_df,emp_df,on="DNO",how="inner")
print(a)

# 2. 사원번호(ENO)가 7788 인 행만 필터
b=a.loc[a["ENO"]==7788]
print(b)
