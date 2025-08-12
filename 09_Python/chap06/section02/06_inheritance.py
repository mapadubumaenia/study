#클래스 상속: 부모클래스의 재산을 물려받아 사용할 수 있는 것
# 부모
class Person:
    def hi(self):
        print("hello")

# TODO: 사용법: class 자식클래스(부모클래스):
#              def 메소드(self):
#                  실행문
# 자식
class Student(Person):
    def hello(self):
        print("안녕")

a=Student()
a.hi()
a.hello()