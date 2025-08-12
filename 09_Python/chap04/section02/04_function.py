#함수 직접 만들기
#{}사용하지 않음 => ,들여쓰기를 사용합니다
# 1) 매개변수 x, return x
def hi():
    print("hello")

hi()  #함수 실행


# 2) 매개변수 O, return x
def hello(name):
    print(f"{name}님")

hello("홍길동")


# 3) 매개변수 o, return o
# TODO: 함수 정의
#   def 함수명(매개변수):
#        return 실행문(매개변수)
def add(a,b):
    return a+b

print(add(1,2))


# 4) TODO: 특수 형태:
# TODO: 함수 정의
#   def 함수명():
#        return 값,값2,...
#   위의 결과는 튜플이 됩니다.
def info():
    return "홍길동",20

print(info())   # 결과: 튜플(읽기전용 배열)


# 5)TODO 디폴트 함수: 매개변수에 기본값을 넣어 둘수 있음
#    =>함수 실행할때 값이 있으면 기본값은 무시됩니다.
def hi2(name="아무개"):
    print(name)

hi2("홍길동")
hi2()