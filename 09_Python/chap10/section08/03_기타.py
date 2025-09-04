# 03_기타등등 (마무리).py
# TODO: 사용법 : import 파일(모듈) as 별명
import pandas as pd
# TODO: 사용법 : from 파일 import 변수(함수)
from emp import emp_data

# 판다스 딕셔너리
df_emp=pd.DataFrame(emp_data)
# 전체조회
print(df_emp)
print()
# TODO: 컬럼 정보만 보기
# 사용법: 변수.columns
print(df_emp.columns)
print()


# TODO 배열처럼 보기:(행,열) 값 보기 => 0행의 ENO값 보기
print(df_emp.loc[0,"ENO"])
print()


# TODO 배열처럼 보기2: (행,열) 값 여러개 보기  => df_emp.index 모든 행 이름 가져오기
print(df_emp.loc[df_emp.index,"ENO"])
print()