#
from os.path import split
import string
# a,b=map(int,input().split())          #=>  map(int...)  리스트 안의 모든 요소를 정수로 변환
#
# if a>b:
#     print(a-b)
# elif a<b:
#     print(b-a)
# else:
#     print(0)


#  7의 배수 7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.
# a=int(input())
# if (a%7==0):
#     print("multiple")
# else:
#     print("not multiple")
#
#
# # 어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.
# a=int(input())
# if(a%2==0):
#     print("even")
# else:
#     print("odd")


#50이상 60이하이면 win을 출력, 그 외에는 lose를 출력하시오.
# a=float(input())
# if(50<=a<=60):
#     print("win")
# else:
#     print("lose")


# 어떤 두 수 a, b가 있을 때 두 수 사이의 모든 정수를 오름차순으로 출력하시오.
# 예를 들어, a=5 , b=10일 경우 5 6 7 8 9 10입니다.
# a,b=map(int,input().split())
# if a<b:
#     for x in range(a, b + 1, 1):
#         print(x)
# else:
#     for x in range(b,a+1,1):
#         print(x)



# 주어진 알파벳이 N 또는 n 이면 "Naver D2", 아니라면 "Naver Whale"을 따옴표를 제외하고 출력한다.

# a=input()
# if a=='N' or a=='n':
#     print("Naver D2")
# else:
#     print("Naver Whale")


# a=input().split()
# b=int(a[0])
# c=int(a[1])
# d=b*100
# if c>d:
#     print("No")
# else:
#     print("Yes")

# a=int(input())
# for i in range(a,0,-1):
#     print(i)


# 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.

a=input()
for ch in string.ascii_lowercase:
    print(a.count(ch),end=" ")