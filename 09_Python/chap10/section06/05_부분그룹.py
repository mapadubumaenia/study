from itertools import groupby

import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 부서별, 직급별 급여 합계 구하기
# TODO 사용법: df.groupby(["컬럼","컬럼2"])["볼컬럼"].sum().reset_index()
grouped=df.groupby(["DNO","JOB"])["SALARY"].sum().reset_index()
print(grouped)


# SALARY 기준 오름차순 정렬
# TODO 사용밥 변수2=변수.sort_values(by="컬럼")
grouped_sorted = grouped.sort_values(by="SALARY")
print(grouped_sorted)