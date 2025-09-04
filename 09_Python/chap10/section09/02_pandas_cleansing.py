import pandas as pd
# 딕셔너리로 데이터 생성
data = {
'이름': ['홍길동', '장길산'],
'나이': [None, 30],
}
# 데이터 프레임 생성
df = pd.DataFrame(data)

# 결측값을(None) 0으로 대체
# TODO 사용법: 변수=df.fillna(바꿀값)
a=df.fillna(0)
print(a)