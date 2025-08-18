# 응용조회
import pandas as pd

# 부서 데이터
# 1️⃣ DEPARTMENT 데이터 예시
data = {
    "DNO": [10, 20, 30, 40],
    "DNAME": ["ACCOUNTING", "RESEARCH", "SALES", "OPERATIONS"],
    "LOC": ["NEW YORK", "DALLAS", "CHICAGO", "BOSTON"]
}
# 데이터프레임: 판다스딕셔너리
df=pd.DataFrame(data)

# 전체 조회
print(df)

# dname(부서명)만 조회: select dname from tb_dept
print(df[["DNAME"]])
# TODO: dname(부서명),loc(부서위치)만 조회하기   select dname,loc from tb_dept
# 사용법:df[["컬럼","LOC"]]
print(df[["DNAME", "LOC"]])

