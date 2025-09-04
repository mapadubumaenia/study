# 01_quiz.py
import pandas as pd
from emp import emp_data

df_emp = pd.DataFrame(emp_data)
print(df_emp)

# 넘파이 배열로 변환
a=df_emp.to_numpy()
print(a)
