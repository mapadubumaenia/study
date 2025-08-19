import pandas as pd
from emp import emp_data


# TODO: 판다스딕셔너리로(데이터프레임) 변경
df=pd.DataFrame(emp_data)
# 조건 조회: ENAME이'SCOTT'인 사원 전체 정보 조회
# sql : select * from emp where ename
a=df.loc[df["ENAME"]=="SCOTT"]
print(a)

