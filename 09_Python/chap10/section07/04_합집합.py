#04_합집합
# 성을:UNION ALL(0) vs UNION
#   => 실행순서: 1)UNION ALL: 2개 데이터 합치기 끝
#   =>          2) 2개 데이터 합치기 + 중복확인(제거)
import pandas as pd
from dept import dept_data
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)


dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)

# 두 데이터프레임을 행 방향으로 합치기(UNION ALL)
#  대/소문자 바꾸기 단축키: CTRL+SHIFT+U
# select dno from dept
# union all
# select dno from emp
a=pd.concat([dept_df["DNO"],emp_df["DNO"]])
print(a)