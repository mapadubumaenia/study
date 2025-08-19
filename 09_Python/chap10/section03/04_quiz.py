#04_quiz
import pandas as pd
from emp import emp_data

df=pd.DataFrame(emp_data)


# MANAGER 가 NULL (NaN) 인 행 필터링
a=df.loc[df["MANAGER"].isna()]
print(a)