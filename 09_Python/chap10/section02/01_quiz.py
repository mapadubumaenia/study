#퀴즈
import pandas as pd
from dept import dept_data
from emp import emp_data
# 1⃣DEPARTMENT , EMPLOYEE 데이터
df_dept = pd.DataFrame(dept_data)
df_emp = pd.DataFrame(emp_data)
# 1) 부서테이블에서 DNO 가 20 보다 큰 부서만 표시
# 2) 사원테이블에서 DNO 가 10 인 사원 전체 출력
# 3) 3) 사원테이블에서 월급이 5000 인 사람 이름 출

#퀴즈 1) 부서테이블에서 DNO 가 20 보다 큰 부서만 표시
a=df_dept[df_dept["DNO"]>20]
print(a)

# 2) 사원테이블에서 DNO 가 10 인 사원 전체 출력
b=df_emp.loc[df_emp["DNO"]==10]
print(b)

# 3) 사원테이블에서 월급이 5000 인 사람 이름 출력
c=df_emp.loc[df_emp["SALARY"]==1600,"ENAME"]
print(c)