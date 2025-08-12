# 클래스의 오버라이딩(재정의, 함수명일치) 소개
# 부모
class Person:
    def hi(self):
        print("hello")

# TODO: 사용법 : class 자식클래스(부모클래스):
#                  def 메소드명(self):  # 단 메소드명은 부모 메소드와 같을 것
#                     실행문
# 자식, Person 상속
class Student(Person):
    def hi(self):
        print("안녕")

a=Student()
a.hi()
