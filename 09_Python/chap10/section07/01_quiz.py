import pandas as pd
from dept import dept_data
from emp import emp_data
# 1⃣EMPLOYEE 데이터
dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)


# 1. 조인(E.DNO = D.DNO)
a=pd.merge(dept_df,emp_df,how='inner',on='DNO')
print(a)


# 2. 사원번호(ENO)가 7499 인 행 필터
b=a.loc[a["ENO"]==7499]
print(b)

# 3. 부서 컬럼만 출력(dept_df 에 있는 컬럼들만
c=b[["DNAME","DNO","LOC"]]
print(c)

# (참고) 데이터프레임.columns : 모든 컬럼 표시
print(b[dept_df.columns])