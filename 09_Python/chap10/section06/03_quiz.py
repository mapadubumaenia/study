import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터
df = pd.DataFrame(emp_data)
# 행 개수 구하기

a=len(df)                   # 총갯수
print(a)

b=df.count()              #NULL 이 있는 COMMISSION은 3개로 나온다, (NULL을 뺸 갯수)
print(b)