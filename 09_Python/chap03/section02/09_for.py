
# 반복문 간략식(단축식)
a=[1,2,3]
# b=[]
# for i in a:
#     b.append(i)
# print(b)

#TODO:단축식 변경
#  사용법: b=[변수 for 변수 in 다른배열]  =>파이썬에만 있음, 배열안에 for문 가능
b=[i for i in a]
print(b)

# 2)복잡 반복문: 인덱스
c=[1,2,3]
for i in range(len(c)):
    print(c[i])


# 위의 식을 간략식으로
# 사용법: 변수=[배열[변수]for 변수 in range(len(배열))]
b=[c[i] for i in range(len(c))]
print(b)