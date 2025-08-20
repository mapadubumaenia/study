import pandas as pd
from dept import dept_data
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)


# 1. 'SALES' 부서 번호(DNO) 조회
# TODO: 1) select dno from dept where dname='SALES'
a=dept_df.loc[dept_df["DNAME"]=="SALES","DNO"]
print(a)

# 2. 사원 중 DNO 가 SALES 부서에 포함된 ENAME 조회
# TODO: 2) select ENAME from emp where dno in (select dno from dept where dname='SALES')
# TODO: 사용법) 변수=emp_df.loc[emp_df["컬럼"].isin(서브데이터), "볼컬럼"]
b=emp_df.loc[emp_df["DNO"].isin(a),"ENAME"]
print(b)