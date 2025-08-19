import pandas as pd
from emp import emp_data
# 1⃣EMPLOYEE 데이터(앞 8 명 예시)
df = pd.DataFrame(emp_data)


# ENAME 이'S'로 시작하는 행 필터링
# TODO: S시작되는 이름을 검색
# TODO: 사용법: df.loc[df["컬럼명"].str.startswith("글자")]
a=df.loc[df["ENAME"].str.startswith("S")]
print(a)


# ENAME 에'F'가 포함된 행 필터링(대소문자 구분)
#  .contains("글자"): 글자가 포함된 단어를 검색
b=df.loc[df["ENAME"].str.contains("S")]
print(b)

# 두 번째 글자가'A'인지 확인(인덱스 1 위치 글자 비교
c=df.loc[df["ENAME"].str[1]=="A"]
print(c)