#아리데베르치!
# 중첩 반복문: 반복문 안에 반복문
# 1)간단 반복문: index X
a=[[1,2],[3,4]]
for x in a:
    for y in x:
        print(y)

# 2)복잡반복문: index O
# TODO: 사용법: for 변수 in range(len(배열))
#                 for 변수2 in range(len(안쪽배열[변수])):
#                    실행문(배열[변수][변수2])
c=[[1,2],[3,4]]
for x in range(len(c)):
  for y in range(len(c[x])):
      print(c[x][y])


