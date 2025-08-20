import pandas as pd
# 예제 데이터
data = {
"NUM": [12.34]
}
df = pd.DataFrame(data)
# 소수점 1 자리까지 반올림

df["반올림"]=df["NUM"].round(1)
print(df["반올림"])