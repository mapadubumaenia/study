import pandas as pd
from dept import dept_data
from emp import emp_data

# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
dept_df = pd.DataFrame(dept_data)
emp_df = pd.DataFrame(emp_data)


# 두 데이터프레임을 행 방향으로 합치기(UNION)
#  합집합: 컬럼개수, 자료형 같아야 합집합
#  .result_index(): 행번호 다시 매기기
#  dhqtus: drop=true: 행이름 삭제하겠다는 의미
# TODO: .reset_index(drop=True) : 인덱스번호 다시 매김
# TODO: 사용법: 변수=판다스.concat([dept_df["공통컬럼"],emp_df["공통컬럼"]]).drop_duplicates().reset_index(drop=True)
result = pd.concat([dept_df[['DNO']],emp_df[['DNO']]]).drop_duplicates().reset_index(drop=True)
print(result)