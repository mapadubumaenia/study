import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# 부서별 최고 급여 계산
# select max(SALARY) from emp group by dno having max(SALARY) >=3000
#  => 팁:sql : (WHERE 조건, HAVING 조건 =>둘다 걸수 있다면 where가 훨씬 성능이 빠르다)
# => 1)sql 실행순서: from - where - group by -select - order by
a=df.groupby("DNO")["SALARY"].max().reset_index()
print(a)


# HAVING 조건(최고 급여가 3000 이상인 부서만 필터링
b=a.loc[a["SALARY"]>=3000]
print(b)
