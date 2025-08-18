#01_lamda.py
#함다(자바의 람다식): 함수를 간단하게 표시하는 기능
#1)
def myprint():
    print("Hello World")
myprint()
# TODO: 람다로 바꾸기
myprint=lambda: print("Hello World")
myprint()

# 2) 매개변수 o
def myhello(x):
    print(x)
myhello("hello")
# TODO: 람다
myhello=lambda x:print(x)
myhello("hello")

#3) 매개변수 o, return o
def square(x):
    return x**3
print(square(4))
# TODO: 람다
# 사용밥: 함수=lamda 매개변수:실행문(매개변수)
# 보통 실행문이 1줄짜리를 람다로 사용합니다.
square=lambda x:x**3
print(square(4))