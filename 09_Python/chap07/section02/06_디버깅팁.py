#TODO: 디버깅팁
#   =>1)print() ->logging출력(라이브러리 설치)
#   =>2) 추가: 도구에 디버깅 메뉴 이용 방법
#      (1) break 포인트 찍기
a=[1,2,3]
a.append(4)
print(a)
a.append(5)
print(a)    #확인용
a.append(6)
print(a)    #확인용

# 반복문 예제
b=[]
for i in range(5):
    b.append(i)
print(b)