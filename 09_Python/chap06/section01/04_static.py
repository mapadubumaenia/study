# 클래스의 전역 메소드
# TODO: 사용법1 : class 클래스명:
#                @staticmethod
#                  def 전역메소드명():
#                     실행문
#       사용법2 : 클래스명.전역메소드()
class Person:
    @staticmethod                     #TODO: 전역메소드 만드는 어노테이션
    def hi():                         #TODO: 전역메소드(self 빼기)
        print("hello")


Person.hi()