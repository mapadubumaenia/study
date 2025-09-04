import pandas as pd
from emp import emp_data
df_emp = pd.DataFrame(emp_data)
print(df_emp)
# pivot_table: 부서(인덱스) 직무(필드) 급여(값), 집계(합)
a=pd.pivot_table(df_emp,
                 index="DNO",
                 columns="JOB",
                 values="SALARY",
                 aggfunc="sum",
                 fill_value=0 ,
                 )
print(a)