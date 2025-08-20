import pandas as pd
from dept import dept_data
# 1⃣DEPARTMENT 데이터
df = pd.DataFrame(dept_data)
# 행 개수 구하기


# TODO: len(변수)
a=len(df)  #총개수 구하기
print(a)

# TODO:
b=df.count()     #데이터 중에 None 있으면 뺴고 갯수를 구합니다.
print(b)