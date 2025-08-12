# 필요한 것은 내 스탠드 더 월드
#집합: set, 중복제거
# TODO: 사용법: 변수={값,값2...}
a={1,2,2}
print(a)


# 추가
# TODO: 사용법: 집합.add(값)
a.add(3)
print(a)

# 삭제
# TODO: 사용법: 집합.remove(값)
a.remove(1)
print(a)

# TODO:응용: 합집합, 교집합, 차집합
b={1,2}
c={2,3}

# TODO: 합집합
# TODO: 사용법: 집합|집합2
print(b|c)

# TODO:교집합
# TODO: 사용법: 집합&집합2
print(b&c)

# TODO:차집합
# TODO: 사용법: 집합-집합2
print(b-c)