#파이썬의 유용한 함수 소개
# 글자 함수들2
a="a B"
#TODO: a 찾기
#사용법:a.find("찾을값"), 인덱스 번호가 리턴됨
print(a.find("a"))

#TODO: B글자 포함 여부, 결과(True,False)
print("B" in a)

#TODO: 공백으로 글자 분리
#사용법:
print(a.split())
print(a[0])

# TODO: 배열의 값들을 공백으로 모두 붙이기
# 예) ["a","b"] => "a b"
b=["a","b"]
print("".join(b))

# TODO: 글자 바꾸기
#  사용법: 글자.replace("이전값","바꿀값")
print(a.replace("a","B"))

#TODO: B글자 개수 세기
print(a.count("B"))


# TODO:  글자 반복:*
# 사용법: 글자*숫자
print("hi"*3)