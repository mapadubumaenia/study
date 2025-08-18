#행조회 하기
import pandas as pd
data = {
    "DNO": [10, 20, 30, 40],
    "DNAME": ["ACCOUNTING", "RESEARCH", "SALES", "OPERATIONS"],
    "LOC": ["NEW YORK", "DALLAS", "CHICAGO", "BOSTON"]
}

#판다스 딕셔너리(데이터 프레임)
df = pd.DataFrame(data)
print(df)
print()

# 0번 행 조회
# TODO: 판다스는 행번호가 있다=>인덱스라고 부름 (자동으로 부여됨)
#       인덱스를 글자로 지정 할 수도 있음
#  사용법: df.loc[인덱스명]
print(df.loc[0])

# TODO 여러행(0,1번행) 조회  =>슬라이싱 사용
#  사용법: df.loc[시작행:끝행]
print(df.loc[0:1])


# 참고 행이름만 가져오기
# TODO:사용법: df.index[인덱스명]
print(df.index[0])

# 여러행(0,1번행) 조회, 단 dname 컬럼만 가져오기
# 사용법:df.loc[시작:끝,['컬럼명']]
print(df.loc[0:1,"DNAME"])   #0    ACCOUNTING  1      RESEARCH