import pandas as pd
from dept import dept_data
df_dept = pd.DataFrame(dept_data)
print(df_dept)
# 넘파이 배열로 변환
# 진짜 간단하게 생각하면 넘파이= 배열   판다스=json형태의 딕셔너리
a=df_dept.to_numpy()
print(a)
