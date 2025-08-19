import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# ename오름차순
a=df.sort_values("ENAME")
print(a)


# ename내림차순
b=df.sort_values("ENAME",ascending=False)
print(b)