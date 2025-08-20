import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 부서별, 직급별 사원 수 구하기
a=df.groupby(["DNO","JOB"])["ENAME"].count().reset_index()
print(a)


# 부서번호(DNO) 기준 오름차순 정렬
b=a.sort_values(by="DNO")
print(b)