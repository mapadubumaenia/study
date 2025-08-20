import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)
# 문자열 붙이기('Oracle ' + DNAME)

#문자열 붙이기('Oracle'+ENAME)
#sql:select 'oracle' ||ENAME as 붙임 from emp
# TODO: 사용법: "글자"+df["컬럼"]
df["붙임"]='oracle '+df["ENAME"]
print(df["붙임"])
