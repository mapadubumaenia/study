import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)



# SALARY 오름차순 정렬(기본값이 오름차순)
# sql: select * from emp order by salary
# TODO: 사용법: 변수.sort_values(by="컬럼명")
a=df.sort_values("SALARY")
print(a)



# SALARY 내림차순 정렬
# sql: select * from emp order by salary desc
# TODO: 사용법: 변수.sort_values(by="컬럼명", ascending=False)
b=df.sort_values("SALARY",ascending=False)
print(b)