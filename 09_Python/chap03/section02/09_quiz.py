
# 퀴즈) 반복문 단축식 바꾸기
a=[10,20,30]
# b=[]
# for i in a:
#     b.append(i)
# print(b)

# TODO: 단축식 바꾸시오

b=[i for i in a]
print(b)

# 퀴즈) 간략식 바꾸기: 인덱스 o
c=[20,30,40]
# d=[]
# for i in range(len(c)):
#     d.append(c[i])

# TODO: 위를 간략식으로 바꾸시오
d=[c[i]for i in range(len(c))]
print(d)