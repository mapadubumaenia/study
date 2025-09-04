#데이터 클렌징: db쪽 용어, 이상한 값을 삭제 또는 바꾸는 행위
import pandas as pd
# 딕셔너리로 데이터 생성
data = {
'이름': ['홍길동', '장길산'],
'나이': [None, 30],
}
# 데이터 프레임 생성
df = pd.DataFrame(data)


# 결측값이(None) 있는 행 삭제
a=df.dropna()
print(a)

print()

# 결측값이 있는 열 삭제
# TODO 사용밥: 변수=df.dropna(axis=1)
#   옵션: axis=0(행)=>생략되있음 보통  , axis=1(열)
b=df.dropna(axis=1)
print(b)