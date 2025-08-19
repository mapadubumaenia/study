# lesson2 근육은 모르게
#06_not_논리조건문
import pandas as pd
from emp import emp_data

# 판다스딕셔너리
df=pd.DataFrame(emp_data)

# 조건: DNO가 10이 아닌 사원 선택  =>긍정에서 바꾸기로 만든다고 생각하는게 편함
# TODO 사용법: 1)데이터프레임.loc[데이터프레임["컬럼명"]!=값]
a=df.loc[df["DNO"]!=10]
# (참고) ~()    로도 가능함  a=df.loc[~(df["DNO"]==10)]

print(a)