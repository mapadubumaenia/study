import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# ENAME 에'M' 문자가 포함된 행 필터링(대소문자 구분)
a=df.loc[df["ENAME"].str.contains("M")]
print(a)


# ENAME 두 번째 글자(인덱스 1)가'O'인 행 필터
b=df.loc[df["ENAME"].str[1]=="O"]
print(b)