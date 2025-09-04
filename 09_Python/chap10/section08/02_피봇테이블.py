import pandas as pd
from emp import emp_data
df_emp = pd.DataFrame(emp_data)
print(df_emp)

# pivot_table:부서(인덱스) 직무(컬럼) 급여(값), 으로 지정해서  집계하기
# sql: 부서별, 직무별 급여평균 구하기
a=pd.pivot_table(df_emp,
                 index="DNO",    #행을 부서번호로 지정
                 columns="JOB",  #컬럼(열) 은 직무로 지정
                 values="SALARY",  #값은 급여로 지정
                 aggfunc="mean",  #집계 : 평균(mean(avg))
                 fill_value=0 ,   #없는 값은 0으로 함
                 )
print(a)