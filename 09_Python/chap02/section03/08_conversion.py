#시간을 멈춰라 마이월드야~
# TODO: 글자 -> 숫자: 사용법: int (변수)
from token import STRING

a="1"
print(int(a))       # 1

# TODO: 글자->실수: 사용밥:float(변수)
b="1.2"
print(float(b))    #1.2

# TODO: 글자를 판단해서 값이 있으면 True, 없으면 False ->
c="1"
print(bool(c))   #true
c=""
print (bool(c))  #false

# TODO: 숫자(정수,실수) ->글자: 사용법: str(숫자)
#    글자붙이기(+) : 모두 글자여야 함(아니면 에러)
d=1
print("일은"+str(d))   #일은1
e=1.2
print("실수는"+str(e))  #실수는1.2

#TODO: f-string 표현식:{} 이용해 글자를 표시하는 방식
#  사용법: f"{변수}은 나이가 {변수2}세 입니다."
h="홍길동"
i=2
print(f"{h}은 나이가 {i}세 입니다")

