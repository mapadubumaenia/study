import pandas as pd
from dept import dept_data
from emp import emp_data
# 1⃣EMPLOYEE 데이터
dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)


# TODO 1. RIGHT OUTER JOIN (E.DNO = D.DNO)
#  오른쪽 아우터 조인: 오른쪽에 있는 테이블은 모두 표시
#  반대쪽 없는 데이터는 null로 표시
a=pd.merge(emp_df,dept_df,how='right',on='DNO')
print(a)

# TODO 2. LEFT OUTER JOIN (E.DNO = D.DNO)
#  왼쪽 아우터 조인: 왼쪽에 있는 테이블은 모두 표시
#  반대쪽 없는 데이터는 null 표시
b=pd.merge(emp_df,dept_df,how='left',on='DNO')
print(b)


# 3. FULL OUTER JOIN (E.DNO = D.DNO
c=pd.merge(dept_df,emp_df,how='outer',on='DNO')
print(c)