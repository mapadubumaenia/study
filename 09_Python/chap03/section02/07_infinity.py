#딱히... 없다!
# 무한 반복문, break, continue
# while 사용
# 무한 반복을 하다가 i값이 3이 되면 중단하세요
i=0
while True:
    print(i)
    # 종료 조건 필수
    if(i==3):
        break
    i+=1


#홀수값만 화면에 표시하세요
a=[1,2,3,4]
for i in a:
    if(i%2==0):
        # TODO: 건너뛰기(스킵): continue
        continue
    print(i)