#판다스: 딕셔너리를 테이블로 보고 sql처럼 사용할 수 있게 하는 라이브러리 =>파이썬에서 데이터 분석을 편리하게 해주는 라이브러리예요.

# TODO 판다스 : 딕셔너리를 테이블로 보고 sql처럼 사용할 수 있게 하는
#          라이브러리
#  예) db 테이블
#    dno  dname  loc
#     10   개발   부산
#    부서 딕셔너리 : {}
#    {"dno":10, "dname":"개발", "loc":"부산"}

import pandas as pd

# 1️⃣ DEPARTMENT 데이터 예시
data = {
    "DNO": [10, 20, 30, 40],
    "DNAME": ["ACCOUNTING", "RESEARCH", "SALES", "OPERATIONS"],
    "LOC": ["NEW YORK", "DALLAS", "CHICAGO", "BOSTON"]
}

# 위의 딕셔너리를 판다스로 바꾸기: 데이터프레임
df=pd.DataFrame(data)

# 전체조회:select * from tb_dept
print(df)