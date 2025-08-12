# 클래스의 전역 필드
# TODO: 사용법1: class 클래스명:
#                  전역필드명=값
#      사용법2: 클래스명.전역필드
class Person:
    kind="인간"    #TODO: 전역 필드(Global Field) = 프로그램 전체(모든 함수/클래스)에서 접근 가능한 변수

print(Person.kind)