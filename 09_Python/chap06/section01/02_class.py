# 파이썬 클래스2: 매개변수 2개 생성자 만들기
# 클래스 정의
# TODO: 사용법: class 클래스명:
#                 def __init__(self, 매개변수, 매개변수2,...):
#                    self.필드 = 매개변수
#                    self.필드2 = 매개변수2
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def hi(self):
        print("hello")

# 클래스 사용
a=Person("홍길동", 20)
print(a.name)
a.hi()